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

import java.util.UUID;

import org.efaps.json.AbstractEFapsJSON;

/**
 * The Class AbstractConfigurationItem.
 *
 * @author The eFaps Team
 */
public abstract class AbstractCI<T extends AbstractCI<T>>
    extends AbstractEFapsJSON
{

    /** The name. */
    private String name;

    /** The uuid. */
    private UUID uuid;

    /** The id. */
    private long id;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId()
    {
        return this.id;
    }

    /**
     * Sets the id.
     *
     * @param _id the new id
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setId(final long _id)
    {
        this.id = _id;
        return (T) this;
    }

    /**
     * Gets the uuid.
     *
     * @return the uuid
     */
    public UUID getUUID()
    {
        return this.uuid;
    }

    /**
     * Sets the uuid.
     *
     * @param _uuid the new uuid
     */
    @SuppressWarnings("unchecked")
    public T setUUID(final UUID _uuid)
    {
        this.uuid = _uuid;
        return (T) this;
    }

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
     * @return
     */
    @SuppressWarnings("unchecked")
    public T setName(final String _name)
    {
        this.name = _name;
        return (T) this;
    }
}
