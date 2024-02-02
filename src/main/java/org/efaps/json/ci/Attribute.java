/*
 * Copyright © 2003 - 2024 The eFaps Team (-)
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
 */
package org.efaps.json.ci;

/**
 * The Class Attribute.
 *
 * @author The eFaps Team
 */
public class Attribute
{

    /** The name. */
    private String name;

    /** The type. */
    private AttributeType type;

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param _name the new name
     * @return the attribute
     */
    public Attribute setName(final String _name)
    {
        this.name = _name;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #type}.
     *
     * @return value of instance variable {@link #type}
     */
    public AttributeType getType()
    {
        return this.type;
    }

    /**
     * Setter method for instance variable {@link #type}.
     *
     * @param _type value for instance variable {@link #type}
     * @return the attribute
     */
    public Attribute setType(final AttributeType _type)
    {
        this.type = _type;
        return this;
    }
}
