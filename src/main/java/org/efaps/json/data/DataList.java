/*
 * Copyright 2003 - 2014 The eFaps Team
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
 * Revision:        $Rev$
 * Last Changed:    $Date$
 * Last Changed By: $Author$
 */

package org.efaps.json.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.efaps.json.AbstractEFapsJSON;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 * @version $Id$
 */
public class DataList
    extends AbstractEFapsJSON
    implements List<ObjectData>
{

    /** The data. */
    private final List<ObjectData> data = new ArrayList<>();

    /**
     * Adds the.
     *
     * @param _data the data
     * @return
     */
    @Override
    public boolean add(final ObjectData _data)
    {
        return this.data.add(_data);
    }

    @Override
    public void add(final int _index,
                    final ObjectData _element)
    {
        this.data.add(_index, _element);
    }

    @Override
    public boolean addAll(final Collection<? extends ObjectData> _c)
    {
        return  this.data.addAll(_c);
    }

    @Override
    public boolean addAll(final int _index,
                          final Collection<? extends ObjectData> _c)
    {
        return  this.data.addAll(_index, _c);
    }

    @Override
    public void clear()
    {
        this.data.clear();
    }

    @Override
    public boolean contains(final Object _o)
    {
        return  this.data.contains(_o);
    }

    @Override
    public boolean containsAll(final Collection<?> _c)
    {
        return this.data.containsAll(_c);
    }

    @Override
    public ObjectData get(final int _index)
    {
        return this.data.get(_index);
    }

    @Override
    public int indexOf(final Object _o)
    {
        return this.data.indexOf(_o);
    }

    @Override
    public boolean isEmpty()
    {
        return this.data.isEmpty();
    }

    @Override
    public Iterator<ObjectData> iterator()
    {
        return this.data.iterator();
    }

    @Override
    public int lastIndexOf(final Object _o)
    {
        return this.data.lastIndexOf(_o);
    }

    @Override
    public ListIterator<ObjectData> listIterator()
    {
        return this.data.listIterator();
    }

    @Override
    public ListIterator<ObjectData> listIterator(final int _index)
    {
        return this.data.listIterator(_index);
    }

    @Override
    public boolean remove(final Object _o)
    {
        return this.data.remove(_o);
    }

    @Override
    public ObjectData remove(final int _index)
    {
        return this.data.remove(_index);
    }

    @Override
    public boolean removeAll(final Collection<?> _c)
    {
        return this.data.removeAll(_c);
    }

    @Override
    public boolean retainAll(final Collection<?> _c)
    {
        return this.data.retainAll(_c);
    }

    @Override
    public ObjectData set(final int _index,
                          final ObjectData _element)
    {
        return this.data.set(_index, _element);
    }

    @Override
    public int size()
    {
        return this.data.size();
    }

    @Override
    public List<ObjectData> subList(final int _fromIndex,
                                    final int _toIndex)
    {
        return this.data.subList(_fromIndex, _toIndex);
    }

    @Override
    public Object[] toArray()
    {
        return this.data.toArray();
    }

    @Override
    public <T> T[] toArray(final T[] _a)
    {
        return this.data.toArray(_a);
    }
}
