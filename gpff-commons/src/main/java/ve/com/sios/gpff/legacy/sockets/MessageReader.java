package ve.com.sios.gpff.legacy.sockets;

import java.io.IOException;

import ve.com.sios.gpff.legacy.sockets.routers.MessageRouter;

/**
 * The Class MessageReader.
 */
public class MessageReader {

    /**
     * Instantiates a new message reader.
     */
    public MessageReader() {
    }

    /**
     * Read detail.
     *
     * @param mrec the mrec
     * @param mh the mh
     * @param mr the mr
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void readDetail(MessageRecord mrec, MessageHandler mh, MessageRouter mr) throws IOException {
        String formatname = null;
        MessageRecord detail = mh.receiveMessage(mr);
        formatname = detail.getFormatName();
        while (!detail.isEmpty()) {
            mrec.addDetail(detail);
            detail = mh.receiveMessage(mr);
            if (!formatname.equals(detail.getFormatName()))
                throw new IOException("Mismatch on detail record format.");
        }
    }

}
