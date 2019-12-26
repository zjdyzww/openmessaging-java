/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.api.exception;

/**
 * The {@code OMSSecurityException} must be thrown when the client have no enough authority to operate an resource.
 *
 * @version  OMS 1.1.0
 * @since  OMS 1.1.0
 */
public class OMSSecurityException extends OMSRuntimeException {
    /**
     * @see OMSRuntimeException#OMSRuntimeException(int, String)
     */
    public OMSSecurityException(int errorCode, String message) {
        super(errorCode, message);
    }

    /**
     * @see OMSRuntimeException#OMSRuntimeException(int, Throwable)
     */
    public OMSSecurityException(int errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    /**
     * @see OMSRuntimeException#OMSRuntimeException(int, String, Throwable)
     */
    public OMSSecurityException(int errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}