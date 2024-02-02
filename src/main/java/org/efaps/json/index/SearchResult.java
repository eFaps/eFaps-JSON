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
package org.efaps.json.index;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.efaps.json.AbstractEFapsJSON;
import org.efaps.json.index.result.Dimension;
import org.efaps.json.index.result.Element;

/**
 * The Class SearchResult.
 *
 * @author The eFaps Team
 */
public class SearchResult
    extends AbstractEFapsJSON
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The elements. */
    private final List<Element> elements = new ArrayList<>();

    /** The elements. */
    private final List<Dimension> dimensions = new ArrayList<>();


    /** The hit count. */
    private long hitCount;

    /**
     * Gets the hit count.
     *
     * @return the hit count
     */
    public long getHitCount()
    {
        return this.hitCount;
    }

    /**
     * Sets the hit count.
     *
     * @param _hitCount the new hit count
     */
    public void setHitCount(final long _hitCount)
    {
        this.hitCount = _hitCount;
    }

    /**
     * Gets the elements.
     *
     * @return the elements
     */
    public List<Element> getElements()
    {
        return this.elements;
    }

    /**
     * Getter method for the instance variable {@link #dimensions}.
     *
     * @return value of instance variable {@link #dimensions}
     */
    public List<Dimension> getDimensions()
    {
        return this.dimensions;
    }

    @Override
    public String toString()
    {
        return String.format("HitCount: %s, Dimensions: %s, Elements: %s", this.getHitCount(), this.getDimensions(),
                        this.getElements());
    }
}
