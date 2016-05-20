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

package org.efaps.json.index.result;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class Dimension
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The label values. */
    private final Set<DimValue> values = new HashSet<>();

    /** The key. */
    private String key;

    /**
     * Getter method for the instance variable {@link #key}.
     *
     * @return value of instance variable {@link #key}
     */
    public String getKey()
    {
        return this.key;
    }

    /**
     * Setter method for instance variable {@link #key}.
     *
     * @param _key value for instance variable {@link #key}
     * @return the dimension
     */
    public Dimension setKey(final String _key)
    {
        this.key = _key;
        return this;
    }

    /**
     * Getter method for the instance variable {@link #values}.
     *
     * @return value of instance variable {@link #values}
     */
    public Set<DimValue> getValues()
    {
        return this.values;
    }

    @Override
    public String toString()
    {
        return String.format("Key: %s, Values: %s", getKey(), getValues());
    }
}
