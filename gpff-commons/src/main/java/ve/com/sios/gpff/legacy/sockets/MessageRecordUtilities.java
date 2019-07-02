/*
 * MessageRecordUtilities.java
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
package ve.com.sios.gpff.legacy.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * The Class MessageRecordUtilities.
 *
 * @author jestevez
 */
public class MessageRecordUtilities {

    /**
     * Gets the class.
     *
     * @param name the name
     * @return the class
     * @throws ClassNotFoundException the class not found exception
     */
    private static Class getClass(String name) throws ClassNotFoundException {

        StringBuilder str = new StringBuilder();

        str.append("ve.com.sios.gpff.legacy.message");
        str.append(".");
        str.append(name.substring(0, 10).trim());
        str.append("Message");

        Class newClass = Class.forName(str.toString());

        // System.out.println("class: '" + newClass.getName() + "'");

        return newClass;
    }

    /**
     * Gets the data.
     *
     * @param str the str
     * @return the data
     * @throws ClassNotFoundException the class not found exception
     * @throws IllegalAccessException the illegal access exception
     * @throws InstantiationException the instantiation exception
     */
    private static MessageRecord getData(String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class newClass = getClass(str);

        MessageRecord mr = (MessageRecord) newClass.newInstance();

        int start = 10;
        int end = 0;
        for (int j = 0; j < mr.getFieldCount(); j++) {
            String string = null;
            end = start + mr.getField(j).getLength();
            string = str.substring(start, end);
            mr.getField(j).setString(string);
            start = end;
        }

        return mr;
    }

    /**
     * Read queue.
     *
     * @param ss the ss
     * @param socket the socket
     * @return the array list
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ClassNotFoundException the class not found exception
     * @throws IllegalAccessException the illegal access exception
     * @throws InstantiationException the instantiation exception
     */
    public static ArrayList<MessageRecord> readQueue(ServerSocket ss, Socket socket)
            throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        ArrayList<MessageRecord> list = new ArrayList<MessageRecord>();
        MessageRecord message = MessageRecordUtilities.get(ss, socket);
        list.add(message);
        System.out.println(message);
        while (!message.getField("HENV").getString().equals("*") && !message.getField("HENV").getString().equals("F")
                && !message.getField("HENV").getString().equals("X")) {
            message = MessageRecordUtilities.get(ss, socket);
            list.add(message);
            System.out.println(message);
        }

        return list;
    }

    /**
     * Gets the.
     *
     * @param ss the ss
     * @param socket the socket
     * @return the message record
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ClassNotFoundException the class not found exception
     * @throws IllegalAccessException the illegal access exception
     * @throws InstantiationException the instantiation exception
     */
    public static MessageRecord get(ServerSocket ss, Socket socket)
            throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        byte[] b = new byte[9216];
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        dis.readFully(b);
        String str = new String(b, "Cp284");
        System.out.println(str);
        return getData(str);
    }

    /**
     * Put.
     *
     * @param ss the ss
     * @param socket the socket
     * @param message the message
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public static void put(ServerSocket ss, Socket socket, MessageRecord message) throws IOException {
        System.out.println("Mensaje de salida: " + message);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        StringBuffer str1 = new StringBuffer();
        MessageField mf = new CharacterField(null, 0, 10);
        int start = message.getClass().getSimpleName().indexOf("Message");
        str1.append(fill(message.getClass().getSimpleName().substring(0, start), mf));
        for (int i = 0; i < message.getFieldCount(); i++) {
            str1.append(fill(message.getField(i).getString(), message.getField(i)));
        }

        System.out.println("str1: " + str1);

        byte[] buffer = str1.toString().getBytes("Cp284");

        dos.write(buffer);
    }

    /**
     * Fill.
     *
     * @param str the str
     * @param field the field
     * @return the string
     */
    private static String fill(String str, MessageField field) {
        if (field.getType() == MessageField.CHARACTERFIELD) {
            return fillWhitespace(str, field);
        } else {
            return fillZero(str, field);
        }
    }

    /**
     * Fill zero.
     *
     * @param str the str
     * @param field the field
     * @return the string
     */
    private static String fillZero(String str, MessageField field) {
        StringBuilder str1 = new StringBuilder();
        if (str.length() < field.getLength()) {
            for (int i = 0; i < field.getLength() - str.length(); i++) {
                str1.append("0");
            }
        }
        return str1.toString() + str;
    }

    /**
     * Fill whitespace.
     *
     * @param str the str
     * @param field the field
     * @return the string
     */
    private static String fillWhitespace(String str, MessageField field) {
        StringBuilder str1 = new StringBuilder();
        if (str.length() < field.getLength()) {
            for (int i = 0; i < field.getLength() - str.length(); i++) {
                str1.append(" ");
            }
        }
        return str + str1.toString();
    }
}
