/*
 * EnhancedDefaultKeyGenerator.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundacion para la Investigacion y Desarrollo del Software Libre en Venezuela
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
package ve.com.sios.gpff.cache.interceptor;

/**
 *
 * @author jestevez
 */
import java.lang.reflect.Method;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.interceptor.KeyGenerator;

/**
 * The Class EnhancedDefaultKeyGenerator.
 */
public class EnhancedDefaultKeyGenerator implements KeyGenerator {

    /** The Constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(EnhancedDefaultKeyGenerator.class);

    /** The Constant NO_PARAM_KEY. */
    public static final int NO_PARAM_KEY = 0;

    /** The Constant NULL_PARAM_KEY. */
    public static final int NULL_PARAM_KEY = 53;

    /** The Constant HASH_FACTOR_1. */
    public static final int HASH_FACTOR_1 = 17;

    /** The Constant HASH_FACTOR_2. */
    public static final int HASH_FACTOR_2 = 31;

    /** The Constant WRAPPER_TYPES. */
    private static final HashSet<Class<?>> WRAPPER_TYPES = getWrapperTypes();

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.cache.interceptor.KeyGenerator#generate(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    public Object generate(Object target, Method method, Object... params) {
        if (params.length == 1 && isWrapperType(params[0].getClass())) {
            return (params[0] == null ? NULL_PARAM_KEY : params[0]);
        }
        if (params.length == 0) {
            return NO_PARAM_KEY;
        }
        int hashCode = HASH_FACTOR_1;
        for (Object object : params) {
            hashCode = HASH_FACTOR_2 * hashCode + (object == null ? NULL_PARAM_KEY : object.hashCode());
        }
        LOG.info("method: [{}] hashCode: [{}]", method.getName(), hashCode);
        return Integer.valueOf(hashCode);
    }

    /**
     * Checks if is wrapper type.
     *
     * @param clazz the clazz
     * @return true, if is wrapper type
     */
    public static boolean isWrapperType(Class<?> clazz) {
        return WRAPPER_TYPES.contains(clazz);
    }

    /**
     * Gets the wrapper types.
     *
     * @return the wrapper types
     */
    private static HashSet<Class<?>> getWrapperTypes() {
        HashSet<Class<?>> ret = new HashSet<Class<?>>();
        ret.add(Boolean.class);
        ret.add(Character.class);
        ret.add(Byte.class);
        ret.add(Short.class);
        ret.add(Integer.class);
        ret.add(Long.class);
        ret.add(Float.class);
        ret.add(Double.class);
        ret.add(Void.class);
        return ret;
    }
}
