/*
 * StringUtilities.java
 *
 * Copyright 2012 SIOS www.sios.com.ve.
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
package ve.com.sios.gpff.common;

import java.util.Random;

/**
 * The Class StringUtilities.
 *
 * @author Jose Luis Estevez jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 29/10/2012
 */
public final class StringUtilities {

    /**
     * Instantiates a new string utilities.
     */
    private StringUtilities() {
        super();
    }

    /**
     * Bytes 2 string.
     *
     * @param bytes the bytes
     * @return the string
     */
    public static String bytes2String(byte[] bytes) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            stringBuffer.append((char) bytes[i]);
        }
        return stringBuffer.toString();
    }

    /**
     * String to hex.
     *
     * @param base the base
     * @return the string
     */
    public static String stringToHex(String base) {
        StringBuilder buffer = new StringBuilder();
        int intValue = 0;
        for (int x = 0; x < base.length(); x++) {
            intValue = base.charAt(x);
            String hex = Integer.toHexString(intValue);
            if (hex.length() == 1) {
                buffer.append("0").append(hex).append("");
            } else {
                buffer.append(hex).append("");
            }
        }
        return buffer.toString();
    }

    /**
     * Byte to ascii.
     *
     * @param b the b
     * @param length the length
     * @return the string
     */
    public static String byteToAscii(byte[] b, int length) {
        String returnString = "";
        for (int i = 0; i < length; i++) {
            returnString += (char) (b[i] & 0xff);
        }
        return returnString;
    }

    /**
     * Random string.
     *
     * @param length the length
     * @return the string
     */
    public static String randomString(int length) {
        String random = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis * length);
        int i = 0;
        while (i < length) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                random += c;
                i++;
            }
        }
        return random;
    }
}
