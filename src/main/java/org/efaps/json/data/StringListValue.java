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
package org.efaps.json.data;

import java.util.List;


/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class StringListValue
    extends AbstractValue<List<String>>
{

    /**
     * List of values.
     */
    private List<String> valueList;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getValue()
    {
        return this.valueList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractValue<List<String>> setValue(final List<String> _value)
    {
        this.valueList = _value;
        return this;
    }

}
