package ve.com.sios.gpff.legacy.sockets.routers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;

/**
 * The Class SocketMessageRouter.
 */
public class SocketMessageRouter extends MessageRouter {

    /** The server. */
    String server;

    /** The port. */
    int port;

    /** The s. */
    Socket s;

    /** The in. */
    DataInputStream in;

    /** The out. */
    DataOutputStream out;

    /**
     * Instantiates a new socket message router.
     */
    public SocketMessageRouter() {
        server = null;
        port = -1;
        s = null;
        in = null;
        out = null;
    }

    /**
     * Instantiates a new socket message router.
     *
     * @param inputstream the inputstream
     * @param outputstream the outputstream
     */
    public SocketMessageRouter(DataInputStream inputstream, DataOutputStream outputstream) {
        server = null;
        port = -1;
        s = null;
        in = null;
        out = null;
        in = inputstream;
        out = outputstream;
    }

    /**
     * Instantiates a new socket message router.
     *
     * @param servername the servername
     * @param serverport the serverport
     */
    public SocketMessageRouter(String servername, int serverport) {
        server = null;
        port = -1;
        s = null;
        in = null;
        out = null;
        server = servername;
        port = serverport;
    }

    /**
     * Instantiates a new socket message router.
     *
     * @param properties the properties
     */
    public SocketMessageRouter(Hashtable properties) {
        server = null;
        port = -1;
        s = null;
        in = null;
        out = null;
        server = (String) properties.get("SocketServerAddress");
        port = Integer.parseInt((String) properties.get("SocketServerPort"));
    }

    /**
     * Instantiates a new socket message router.
     *
     * @param socket the socket
     */
    public SocketMessageRouter(Socket socket) {
        server = null;
        port = -1;
        s = null;
        in = null;
        out = null;
        s = socket;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.routers.MessageRouter#close()
     */
    public void close() throws IOException {
        if (in != null)
            in.close();
        in = null;
        if (out != null)
            out.close();
        out = null;
        if (s != null)
            s.close();
        s = null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.routers.MessageRouter#flush()
     */
    public void flush() throws IOException {
        out.flush();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.routers.MessageRouter#open()
     */
    public void open() throws IOException {
        if (in == null || out == null) {
            if (s == null) {
                if (server == null || port == -1)
                    throw new IOException("Server name or port not provided");
                s = new Socket(server, port);
            }
            if (in == null)
                in = new DataInputStream(new BufferedInputStream(s.getInputStream()));
            if (out == null)
                out = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.routers.MessageRouter#receive()
     */
    public byte[] receive() throws IOException {
        if (in == null)
            open();
        byte message[] = new byte[in.readShort()];
        in.readFully(message);
        // servlet.debug("receiveBefore: " + new String(message));
        String encode = new String(message, "ISO8859-1");
        // servlet.debug("receiveAfter : " + encode);
        // servlet.debug("receiveAfter2: " + new String(encode.getBytes()));
        // return message;
        return encode.getBytes();
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.routers.MessageRouter#send(byte[])
     */
    public void send(byte message[]) throws IOException {
        if (out == null)
            open();
        // servlet.debug("send: " + new String(message));
        out.writeShort(message.length);
        out.write(message);
    }

    /**
     * Sets the input stream.
     *
     * @param inputstream the new input stream
     */
    public void setInputStream(DataInputStream inputstream) {
        in = inputstream;
    }

    /**
     * Gets the input stream.
     *
     * @return the input stream
     */
    public DataInputStream getInputStream() {
        return in;
    }

    /**
     * Sets the output stream.
     *
     * @param outputstream the new output stream
     */
    public void setOutputStream(DataOutputStream outputstream) {
        out = outputstream;
    }

    /**
     * Sets the server.
     *
     * @param servername the servername
     * @param serverport the serverport
     */
    public void setServer(String servername, int serverport) {
        server = servername;
        port = serverport;
    }

    /**
     * Sets the socket.
     *
     * @param socket the new socket
     */
    public void setSocket(Socket socket) {
        s = socket;
    }

}
