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


package org.efaps.json.ci;


/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class AttributeType
{

    /** The name. */
    private String name;

    /** The info. */
    private String info;

    /**
     * Getter method for the instance variable {@link #name}.
     *
     * @return value of instance variable {@link #name}
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Setter method for instance variable {@link #name}.
     *
     * @param _name value for instance variable {@link #name}
     * @return the attribute type
     */
    public AttributeType setName(final String _name)
    {
        this.name = _name;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #info}.
     *
     * @return value of instance variable {@link #info}
     */
    public String getInfo()
    {
        return this.info == null ? "" : this.info;
    }

    /**
     * Setter method for instance variable {@link #info}.
     *
     * @param _info value for instance variable {@link #info}
     * @return the attribute type
     */
    public AttributeType setInfo(final String _info)
    {
        this.info = _info;
        return this;
    }
}
