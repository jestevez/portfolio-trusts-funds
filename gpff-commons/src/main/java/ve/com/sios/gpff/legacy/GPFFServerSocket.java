package ve.com.sios.gpff.legacy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * The Class GPFFServerSocket.
 */
public class GPFFServerSocket extends ServerSocket {

    /** The socket. */
    private Socket socket = null;

    /** The dis. */
    private DataInputStream dis = null;

    /** The dos. */
    private DataOutputStream dos = null;

    /**
     * Instantiates a new GPFF server socket.
     *
     * @param port the port
     * @param timeOut the time out
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public GPFFServerSocket(int port, String timeOut) throws IOException {
        super(port);
        super.setSoTimeout(Integer.parseInt(timeOut));
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
     * Sets the socket.
     *
     * @param socket the new socket
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void setSocket(Socket socket) throws IOException {
        this.socket = socket;
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
    }

    /**
     * Gets the data input stream.
     *
     * @return the data input stream
     */
    public DataInputStream getDataInputStream() {
        return dis;
    }

    /**
     * Gets the data output stream.
     *
     * @return the data output stream
     */
    public DataOutputStream getDataOutputStream() {
        return dos;
    }

}
