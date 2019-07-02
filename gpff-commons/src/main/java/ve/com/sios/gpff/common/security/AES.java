/*
 * AES.java
 *
 * Copyright 2012 SIOS www.sios.com.ve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ve.com.sios.gpff.common.security;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

import ve.com.sios.gpff.common.StringUtilities;

/**
 * Esta clase implementa el algoritmo AES.
 *
 * @author Jose Luis Estevez jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 28/10/2012
 */
public final class AES {

    /** The Constant ALGORITHM. */
    private static final String ALGORITHM = "AES";

    /** The Constant TRANSFORMATION. */
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    /** The Constant UNICODE_FORMAT. */
    private static final String UNICODE_FORMAT = "UTF8";

    /** The Constant IV_STRING. */
    private static final String IV_STRING = "kvuSD8hq";

    /**
     * Instantiates a new aes.
     */
    private AES() {
        super();
    }

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

        byte[] keyValue = Hex.decodeHex(keyString.toCharArray());

        SecretKeySpec secretKeySpec = new SecretKeySpec(keyValue, ALGORITHM);

        Cipher cipher;
        byte[] t = Hex.decodeHex(ivString.toCharArray());
        IvParameterSpec iv = new IvParameterSpec(t);
        cipher = Cipher.getInstance(TRANSFORMATION);

        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, iv);

        byte[] cleartext = unencryptedString.getBytes(UNICODE_FORMAT);
        byte[] ciphertext = cipher.doFinal(cleartext);

        return Base64.getEncoder().encode(ciphertext).toString();

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

        byte[] keyValue = Hex.decodeHex(keyString.toCharArray());

        DESedeKeySpec keySpec = new DESedeKeySpec(keyValue);
        SecretKeyFactory mySecretKeyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey key = mySecretKeyFactory.generateSecret(keySpec);

        Cipher cipher;
        if (ivString != null) {
            byte[] t = Hex.decodeHex(ivString.toCharArray());
            IvParameterSpec iv = new IvParameterSpec(t);
            cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, key, iv);
        } else {
            cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
        }

        byte[] dec = Base64.getDecoder().decode(encryptedString);
        byte[] utf8 = cipher.doFinal(dec);
        return new String(utf8, UNICODE_FORMAT);

    }

    /**
     * Encrypt BB.
     *
     * @param unencryptedString the unencrypted string
     * @param keyString the key string
     * @return the string
     * @throws Exception the exception
     */
    public static String encryptBB(String unencryptedString, String keyString) throws Exception {
        return encrypt(unencryptedString, new String(Hex.encodeHex(keyString.getBytes())), StringUtilities.stringToHex(IV_STRING));
    }

    /**
     * Decrypt BB.
     *
     * @param encryptedString the encrypted string
     * @param keyString the key string
     * @return the string
     * @throws Exception the exception
     */
    public static String decryptBB(String encryptedString, String keyString) throws Exception {
        return decrypt(encryptedString, new String(Hex.encodeHex(keyString.getBytes())), StringUtilities.stringToHex(IV_STRING));
    }

}