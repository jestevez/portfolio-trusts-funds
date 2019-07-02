/*
 * StartPrinterSocket.java
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.AS400Text;
import com.ibm.as400.access.ProgramCall;
import com.ibm.as400.access.ProgramParameter;

/**
 * The Class StartPrinterSocket.
 *
 * @author jestevez
 */
public class StartPrinterSocket {
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(StartPrinterSocket.class);

    /** The Constant LOCAL_PORT. */
    private static final int LOCAL_PORT = 45001;

    /** The Constant PGM_STRSOCKIMP. */
    private static final String PGM_STRSOCKIMP = "/QSYS.LIB/GPPGMWEB.LIB/STRSOCKIMP.PGM";

    /** The Constant TIMEOUT. */
    private static final int TIMEOUT = 100000;

    /** The system name. */
    private final String systemName;

    /** The username. */
    private final String username;

    /** The password. */
    private final String password;

    /**
     * Instantiates a new start printer socket.
     *
     * @param systemName the system name
     * @param username the username
     * @param password the password
     */
    public StartPrinterSocket(String systemName, String username, String password) {
        this.systemName = systemName;
        this.username = username;
        this.password = password;
    }

    /** The socket. */
    private Socket socket = null;

    /** The server socket. */
    private ServerSocket serverSocket = null;

    /**
     * Gets the server socket.
     *
     * @return the server socket
     */
    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    /**
     * Gets the socket.
     *
     * @return the socket
     */
    public Socket getSocket() {
        return socket;
    }

    /**
     * Inits the socket printer.
     *
     * @throws Exception the exception
     */
    public void initSocketPrinter() throws Exception {
        try {
            final ServerSocket ss = new ServerSocket(LOCAL_PORT);
            LOGGER.info("ServerSocket LocalPort: [{}]", ss.getLocalPort());
            (new Thread() {

                @Override
                public void run() {
                    AS400 as400 = new AS400(systemName, username, password);
                    ProgramCall pgm = new ProgramCall(as400);
                    ProgramParameter[] parmList = new ProgramParameter[1];
                    AS400Text text = new AS400Text(5);

                    // OJO El puerto a enviar es el puerto local del socket java
                    LOGGER.info("ServerSocket LocalPort: [{}]", ss.getLocalPort());
                    parmList[0] = new ProgramParameter(text.toBytes((ss.getLocalPort() + "")));
                    try {

                        LOGGER.info("call pgm [{}] port [{}] ", PGM_STRSOCKIMP, ss.getLocalPort());
                        pgm.setProgram(PGM_STRSOCKIMP, parmList);
                        if (pgm.run() != true) {
                            LOGGER.info("The pgm [{}] no run", PGM_STRSOCKIMP);
                            // Si el programa falla obtener los mensajes
                            AS400Message[] messagelist = pgm.getMessageList();
                            for (int i = 0; i < messagelist.length; ++i) {
                                LOGGER.warn(messagelist[i].toString());
                            }
                        } else {
                            LOGGER.info("Pgm execute ok");
                        }

                    } catch (Exception ex) {
                        LOGGER.error("Call pgm failed", ex);
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
}
