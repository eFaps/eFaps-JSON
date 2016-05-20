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
import java.util.HashMap;
import java.util.Map;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class Element
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The oid. */
    private String oid;

    /** The text. */
    private String text;

    /** The fields. */
    private final Map<String, String> fields = new HashMap<>();

    /**
     * Gets the oid.
     *
     * @return the oid
     */
    public String getOid()
    {
        return this.oid;
    }

    /**
     * Sets the oid.
     *
     * @param _oid the oid
     * @return the element
     */
    public Element setOid(final String _oid)
    {
        this.oid = _oid;
        return this;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText()
    {
        return this.text;
    }

    /**
     * Sets the text.
     *
     * @param _text the text
     * @return the element
     */
    public Element setText(final String _text)
    {
        this.text = _text;
        return this;
    }

    /**
     * Gets the fields.
     *
     * @return the fields
     */
    public Map<String, String> getFields()
    {
        return this.fields;
    }

    /**
     * Adds the field.
     *
     * @param _key the key
     * @param _value the value
     * @return the element
     */
    public Element addField(final String _key,
                            final String _value)
    {
        this.fields.put(_key, _value);
        return this;
    }

    @Override
    public String toString()
    {
        return String.format("OID: %s, Text: %s", this.oid, this.text);
    }
}
