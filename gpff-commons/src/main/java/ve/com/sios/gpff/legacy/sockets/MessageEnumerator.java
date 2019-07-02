package ve.com.sios.gpff.legacy.sockets;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * The Class MessageEnumerator.
 */
public class MessageEnumerator implements Enumeration {

    /** The myrec. */
    MessageRecord myrec;

    /** The fcount. */
    int fcount;

    /** The fpos. */
    int fpos;

    /**
     * Instantiates a new message enumerator.
     *
     * @param mr the mr
     */
    protected MessageEnumerator(MessageRecord mr) {
        myrec = mr;
        fcount = myrec.getFieldCount();
        fpos = 0;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.util.Enumeration#hasMoreElements()
     */
    public boolean hasMoreElements() {
        return fpos < fcount;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.util.Enumeration#nextElement()
     */
    public Object nextElement() throws NoSuchElementException {
        if (fpos >= fcount) {
            throw new NoSuchElementException();
        }
        return myrec.getField(fpos++);
    }

}
