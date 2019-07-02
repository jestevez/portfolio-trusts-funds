/*
 * FTPUtil.java
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
package ve.com.sios.gpff.common.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ResourceBundle;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class FTPUtil.
 *
 * @author jestevez
 */
public class FTPUtil {
    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(FTPUtil.class);

    /**
     * Gets the.
     *
     * @param remote the remote
     * @param local the local
     * @return true, if successful
     * @throws Exception the exception
     */
    public static boolean get(String remote, String local) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("gpff");
        String remotedir = bundle.getString("ftp.remotedir");
        return get(remote, local, remotedir);
    }

    /**
     * Gets the.
     *
     * @param remote the remote
     * @param local the local
     * @param remotedir the remotedir
     * @return true, if successful
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static boolean get(String remote, String local, String remotedir) throws IOException {
        FTPClient ftp = new FTPClient();
        FTPClientConfig config = new FTPClientConfig();
        ftp.configure(config);
        boolean success = false;
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("gpff");
            String server = bundle.getString("ftp.servername");
            String user = bundle.getString("ftp.username");
            String password = bundle.getString("ftp.password");

            int reply;
            ftp.connect(server);
            LOG.debug("Connected");
            LOG.info(ftp.getReplyString());
            // After connection attempt, you should check the reply code to
            // verify
            // success.
            reply = ftp.getReplyCode();

            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                LOG.error("FTP server refused connection.");
                return false;
            }

            if (!ftp.login(user, password)) {
                ftp.logout();
                LOG.error("FTP server refused connection.");
                return false;
            }
            ftp.setFileType(FTP.ASCII_FILE_TYPE);

            ftp.enterLocalActiveMode();
            // ftp.enterLocalPassiveMode();

            if (ftp.changeWorkingDirectory(remotedir)) {
                File downloadFile = new File(local);
                OutputStream output = new BufferedOutputStream(new FileOutputStream(downloadFile));
                success = ftp.retrieveFile(remote, output);
                output.close();
            }

            ftp.logout();
            ftp.disconnect();
            System.out.print(ftp.getReplyString());
            return success;
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    // do nothing
                }
            }
        }
    }

    /**
     * Put.
     *
     * @param local the local
     * @param remote the remote
     * @return true, if successful
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static boolean put(String local, String remote) throws IOException {
        FTPClient ftp = new FTPClient();
        FTPClientConfig config = new FTPClientConfig();
        ftp.configure(config);
        boolean success = false;
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("gpff");
            String server = bundle.getString("ftp.servername");
            String user = bundle.getString("ftp.username");
            String password = bundle.getString("ftp.password");
            String remotedir = bundle.getString("ftp.remotedir");

            int reply;
            ftp.connect(server);
            LOG.debug("Connected");
            LOG.debug(ftp.getReplyString());
            // After connection attempt, you should check the reply code to
            // verify
            // success.
            reply = ftp.getReplyCode();

            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                LOG.error("FTP server refused connection.");
                return false;
            }

            if (!ftp.login(user, password)) {
                ftp.logout();
                LOG.error("FTP server refused connection.");
                return false;
            }
            ftp.setFileType(FTP.ASCII_FILE_TYPE);

            ftp.enterLocalActiveMode();
            // ftp.enterLocalPassiveMode();

            if (ftp.changeWorkingDirectory(remotedir)) {
                InputStream input = new FileInputStream(local);
                success = ftp.storeFile(remote, input);
                input.close();
            }

            ftp.logout();
            ftp.disconnect();
            LOG.debug(ftp.getReplyString());
            return success;
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    // do nothing
                }
            }
        }

    }

}
