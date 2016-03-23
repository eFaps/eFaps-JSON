/*
 * Copyright 2003 - 2016 The eFaps Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.efaps.json.reply;

import org.efaps.json.AbstractEFapsJSON;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class ErrorReply
    extends AbstractEFapsJSON
{

    /** The error. */
    private String error;

    /** The error. */
    private String message;

    /** The stacktrace. */
    private String stacktrace;

    /**
     * Getter method for the instance variable {@link #error}.
     *
     * @return value of instance variable {@link #error}
     */
    public String getError()
    {
        return this.error;
    }

    /**
     * Setter method for instance variable {@link #error}.
     *
     * @param _error value for instance variable {@link #error} @return the
     * error reply
     */
    public ErrorReply setError(final String _error)
    {
        this.error = _error;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #message}.
     *
     * @return value of instance variable {@link #message}
     */
    public String getMessage()
    {
        return this.message;
    }

    /**
     * Setter method for instance variable {@link #message}.
     *
     * @param _message value for instance variable {@link #message} @return the
     * error reply
     */
    public ErrorReply setMessage(final String _message)
    {
        this.message = _message;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #stacktrace}.
     *
     * @return value of instance variable {@link #stacktrace}
     */
    public String getStacktrace()
    {
        return this.stacktrace;
    }

    /**
     * Setter method for instance variable {@link #stacktrace}.
     *
     * @param _stacktrace value for instance variable {@link
     * #stacktrace} @return the error reply
     */
    public ErrorReply setStacktrace(final String _stacktrace)
    {
        this.stacktrace = _stacktrace;
        return this;
    }
}
