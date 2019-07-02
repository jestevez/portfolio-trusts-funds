package ve.com.sios.gpff.common.security;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Hex;

/**
 * Esta clase implementa el algoritmo TripleDES @date 28/10/2012.
 *
 * @author Jose Luis Estevez jose.estevez.prieto@gmail.com
 * @version 1.0
 */
public class TripleDES {

    /** The Constant ALGORITHM. */
    private static final String ALGORITHM = "TripleDES";

    /** The Constant TRANSFORMATION. */
    private static final String TRANSFORMATION = "TripleDES/CBC/PKCS5Padding";

    /** The Constant UNICODE_FORMAT. */
    private static final String UNICODE_FORMAT = "UTF8";

    /**
     * Encrypt.
     *
     * @param unencryptedString the unencrypted string
     * @param keyString the key string
     * @param ivString the iv string
     * @return the string
     * @throws Exception the exception
     */
    public static String encrypt(String unencryptedString, String keyString, String ivString) throws Exception {
        try {
            byte[] keyValue = Hex.decodeHex(keyString.toCharArray());

            DESedeKeySpec keySpec = new DESedeKeySpec(keyValue);
            SecretKeyFactory mySecretKeyFactory = SecretKeyFactory.getInstance(ALGORITHM);
            SecretKey key = mySecretKeyFactory.generateSecret(keySpec);

            byte[] t = Hex.decodeHex(ivString.toCharArray());
            IvParameterSpec iv = new IvParameterSpec(t);

            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);

            byte[] cleartext = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] ciphertext = cipher.doFinal(cleartext);

            String encryptedString = Base64.getEncoder().encode(ciphertext).toString();

            return encryptedString;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Decrypt.
     *
     * @param encryptedString the encrypted string
     * @param keyString the key string
     * @param ivString the iv string
     * @return the string
     * @throws Exception the exception
     */
    public static String decrypt(String encryptedString, String keyString, String ivString) throws Exception {
        try {
            byte[] keyValue = Hex.decodeHex(keyString.toCharArray());

            DESedeKeySpec keySpec = new DESedeKeySpec(keyValue);
            SecretKeyFactory mySecretKeyFactory = SecretKeyFactory.getInstance(ALGORITHM);
            SecretKey key = mySecretKeyFactory.generateSecret(keySpec);

            byte[] t = Hex.decodeHex(ivString.toCharArray());
            IvParameterSpec iv = new IvParameterSpec(t);

            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, key, iv);

            byte[] dec = Base64.getDecoder().decode(encryptedString);
            byte[] utf8 = cipher.doFinal(dec);
            String unencryptedString = new String(utf8, UNICODE_FORMAT);
            return unencryptedString;
        } catch (Exception e) {
            throw e;
        }
    }

}
