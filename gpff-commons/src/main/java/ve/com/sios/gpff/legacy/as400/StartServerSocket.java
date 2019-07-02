/*
 * StartServerSocket.java
 *
 * Copyright 2014 SIOS www.sios.com.ve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ve.com.sios.gpff.legacy.as400;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.AS400Text;
import com.ibm.as400.access.ProgramCall;
import com.ibm.as400.access.ProgramParameter;

import ve.com.sios.gpff.legacy.sockets.MessageRecord;
import ve.com.sios.gpff.legacy.sockets.MessageRecordUtilities;

/**
 * @author jestevez
 */
public class StartServerSocket {
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(StartServerSocket.class);
    public static final ResourceBundle bundle = ResourceBundle.getBundle("gpff");
    public static final String AS400_LIBRARY = bundle.getString("as400.library");
    public static final String STRSOCKSRV = bundle.getString("pgm.strsocksrv");
    public static final String CORREGPT = bundle.getString("pgm.corrergp");
    /** The Constant TIMEOUT. */
    private static final int TIMEOUT = 100000;

    public static int LOCAL_PORT = Integer.parseInt(bundle.getString("init.port"));
    private String systemName;
    private String username;
    private String password;
    private String ip;
    private Integer port;

    private String sessionUser;
    private long currentTimeMillis;

    public StartServerSocket(String systemName, String username, String password, String ip) {
        this.systemName = systemName;
        this.username = username;
        this.password = password;
        this.ip = ip;
    }

    public StartServerSocket(String systemName, String username, String password, String ip, Integer port) {
        this.systemName = systemName;
        this.username = username;
        this.password = password;
        this.ip = ip;
        this.port = port;
    }

    public Integer getPort() {
        return port;
    }

    private Socket socket = null;
    private ServerSocket serverSocket = null;

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public Socket getSocket() {
        return socket;
    }

    public int getLocalPort() {
        return LOCAL_PORT;
    }

    public String getSessionUser() {
        return sessionUser;
    }

    public long getCurrentTimeMillis() {
        return currentTimeMillis;
    }

    /*
     * Para que funcione la Ip del servidor debe estar registrada en GPPGMWEB/GPSOCKCTL update GPPGMWEB.GPSOCKCTL set SOCIP2='172.18.18.135',
     * SOCIP1='172.18.18.135'
     */
    public void initSocketClient() throws Exception {
        try {
            this.currentTimeMillis = System.currentTimeMillis();
            int userPort = 0;
            if (this.port != null) {
                userPort = port;
            } else {
                LOCAL_PORT += 1;
                userPort = LOCAL_PORT;
            }
            this.port = userPort;
            final ServerSocket ss = new ServerSocket(userPort);
            LOGGER.info("ServerSocket LocalPort: [{}]", ss.getLocalPort());
            // Enviar parametros del Socket Java al AS400
            // Se inicia el socket del lado del AS400 por eso lo ejecutamos en un hilo
            (new Thread() {

                @Override
                public void run() {
                    AS400 as400 = new AS400(systemName, username, password);
                    ProgramCall pgm = new ProgramCall(as400);
                    ProgramParameter[] parmList = new ProgramParameter[2];

                    try {
                        // OJO El puerto a enviar es el puerto local del socket java
                        LOGGER.info("ServerSocket LocalPort: [{}] IP [{}]  ", ss.getLocalPort(), ip);

                        parmList[0] = new ProgramParameter((new AS400Text(5)).toBytes(ss.getLocalPort() + ""));
                        parmList[1] = new ProgramParameter((new AS400Text(20)).toBytes(ip));

                        LOGGER.info("call [{}], port [{}] ip [{}]", STRSOCKSRV, ss.getLocalPort(), ip);
                        pgm.setProgram(STRSOCKSRV, parmList);
                        if (pgm.run() != true) {
                            LOGGER.info("The pgm [{}] no run", STRSOCKSRV);
                            // Si el programa falla obtener los mensajes
                            AS400Message[] messagelist = pgm.getMessageList();
                            for (int i = 0; i < messagelist.length; ++i) {
                                LOGGER.warn(messagelist[i].toString());
                            }
                        } else {
                            LOGGER.info("----> [{}]", pgm.getServerJob().getJobDescription());
                        }
                    } catch (Exception ex) {
                        LOGGER.error("Exception: ", ex);
                    }

                }
            }).start();

            // Aceptar la conexión
            this.socket = ss.accept();
            ss.setSoTimeout(TIMEOUT);
            this.serverSocket = ss;

        } catch (Exception ex) {
            throw ex;
        }

    }

    /**
     * Call generic.
     *
     * @param ss the ss
     * @param socket the socket
     * @param pgm the pgm
     * @param area the area
     * @return the array list
     * @throws Exception the exception
     */
    public ArrayList<MessageRecord> callGeneric(ServerSocket ss, Socket socket, String pgm, String area) throws Exception {
        try {
            AS400 as400 = new AS400(systemName, username, password);
            ProgramCall programCall = new ProgramCall(as400);

            ProgramParameter[] parmList = new ProgramParameter[4];
            AS400Text text = new AS400Text(10);
            AS400Text port = new AS400Text(5);
            AS400Text cfid = new AS400Text(4);
            AS400Text data = new AS400Text(10);

            parmList[0] = new ProgramParameter(text.toBytes(pgm));
            parmList[1] = new ProgramParameter(port.toBytes("" + ss.getLocalPort()));
            parmList[2] = new ProgramParameter(cfid.toBytes(area));
            parmList[3] = new ProgramParameter(data.toBytes(AS400_LIBRARY));

            programCall.setProgram(CORREGPT, parmList);

            LOGGER.info("call [{}] [{}] port [{}] area [{}], lib [{}]", CORREGPT, pgm, ss.getLocalPort(), area, AS400_LIBRARY);

            boolean run = programCall.run();

            if (run) {
                LOGGER.info("La llamada al programa [{}] se ejecuto correctamente", pgm);
                return MessageRecordUtilities.readQueue(ss, socket);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return null;
    }

    public void exit() {
        try {
            this.socket.close();
            this.serverSocket.close();
        } catch (Exception ex) {
            LOGGER.error("Exception: ", ex);
        }
    }
}
