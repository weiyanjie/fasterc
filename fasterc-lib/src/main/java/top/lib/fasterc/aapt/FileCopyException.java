/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package top.lib.fasterc.aapt;

public class FileCopyException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6670157031514003361L;

    /**
     * @param message
     */
    public FileCopyException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public FileCopyException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public FileCopyException(String message, Throwable cause) {
        super(message, cause);
    }
}
