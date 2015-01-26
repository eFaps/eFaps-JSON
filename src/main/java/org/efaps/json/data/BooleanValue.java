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
 * Revision:        $Rev: 14215 $
 * Last Changed:    $Date: 2014-10-13 17:21:01 -0500 (Mon, 13 Oct 2014) $
 * Last Changed By: $Author: jan@moxter.net $
 */

package org.efaps.json.data;



/**
 * TODO comment!
 *
 * @author The eFaps Team
 * @version $Id: LongValue.java 14215 2014-10-13 22:21:01Z jan@moxter.net $
 */
public class BooleanValue
    extends AbstractValue<Boolean>
{

    private Boolean value;

    /**
     * Getter method for the instance variable {@link #value}.
     *
     * @return value of instance variable {@link #value}
     */
    @Override
    public Boolean getValue()
    {
        return this.value;
    }

    /**
     * Setter method for instance variable {@link #value}.
     *
     * @param _value value for instance variable {@link #value}
     */
    @Override
    public BooleanValue setValue(final Boolean _value)
    {
        this.value = _value;
        return this;
    }
}
