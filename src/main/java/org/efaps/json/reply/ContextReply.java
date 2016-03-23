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
public class ContextReply
    extends AbstractEFapsJSON
{

    /** The user name. */
    private String userName;

    /** The user first name. */
    private String userFirstName;

    /** The user last name. */
    private String userLastName;

    /** The locale. */
    private String locale;

    /** The company. */
    private String companyName;

    /**
     * Getter method for the instance variable {@link #userName}.
     *
     * @return value of instance variable {@link #userName}
     */
    public String getUserName()
    {
        return this.userName;
    }

    /**
     * Setter method for instance variable {@link #userName}.
     *
     * @param _userName value for instance variable {@link #userName}
     * @return the context reply
     */
    public ContextReply setUserName(final String _userName)
    {
        this.userName = _userName;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #userFirstName}.
     *
     * @return value of instance variable {@link #userFirstName}
     */
    public String getUserFirstName()
    {
        return this.userFirstName;
    }

    /**
     * Setter method for instance variable {@link #userFirstName}.
     *
     * @param _userFirstName value for instance variable {@link
     * #userFirstName}
     * @return the context reply
     */
    public ContextReply setUserFirstName(final String _userFirstName)
    {
        this.userFirstName = _userFirstName;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #userLastName}.
     *
     * @return value of instance variable {@link #userLastName}
     */
    public String getUserLastName()
    {
        return this.userLastName;
    }

    /**
     * Setter method for instance variable {@link #userLastName}.
     *
     * @param _userLastName value for instance variable
     * @return the context reply
     */
    public ContextReply setUserLastName(final String _userLastName)
    {
        this.userLastName = _userLastName;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #locale}.
     *
     * @return value of instance variable {@link #locale}
     */
    public String getLocale()
    {
        return this.locale;
    }

    /**
     * Setter method for instance variable {@link #locale}.
     *
     * @param _locale value for instance variable {@link #locale}
     * @return the context reply
     */
    public ContextReply setLocale(final String _locale)
    {
        this.locale = _locale;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #companyName}.
     *
     * @return value of instance variable {@link #companyName}
     */
    public String getCompanyName()
    {
        return this.companyName;
    }

    /**
     * Setter method for instance variable {@link #companyName}.
     *
     * @param _companyName the _company name
     * @return the context reply
     */
    public ContextReply setCompanyName(final String _companyName)
    {
        this.companyName = _companyName;
        return this;
    }
}
