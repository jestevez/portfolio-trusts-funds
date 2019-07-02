/*
 * MessageException.java
 *
 * Copyright 2013 - Soluciones Integrales Open-Source SiOS
 * Copyright 2013 - Fundacion para la Investigacion y Desarrollo del Software Libre en Venezuela
 *
 * http://www.sios.com.ve
 * http://www.indesoft.org.ve
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
package ve.com.sios.gpff.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class MessageException.
 *
 * @author Jose Luis Estevez jestevez@indesoft.org.ve jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 10/12/2012
 */
public class MessageException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2451561510106199125L;

    /** The errors. */
    private List<String> errors = new ArrayList<String>();

    /**
     * Instantiates a new message exception.
     *
     * @param cause the cause
     */
    public MessageException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new message exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public MessageException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new message exception.
     *
     * @param message the message
     */
    public MessageException(String message) {
        super(message);
    }

    /**
     * Instantiates a new message exception.
     */
    public MessageException() {
        super();
    }

    /**
     * Instantiates a new message exception.
     *
     * @param errors the errors
     */
    public MessageException(List<String> errors) {
        this.errors = errors;
    }

    /**
     * Gets the errors.
     *
     * @return the errors
     */
    public List<String> getErrors() {
        return errors;
    }

}
