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

import org.joda.time.DateTime;


/**
 * TODO comment!
 *
 * @author The eFaps Team
 */
public class DateTimeValue
    extends AbstractValue<DateTime>
{

   private DateTime value;

   /**
    * Getter method for the instance variable {@link #value}.
    *
    * @return value of instance variable {@link #value}
    */
   @Override
   public DateTime getValue()
   {
       return this.value;
   }

   /**
    * Setter method for instance variable {@link #value}.
    *
    * @param _value value for instance variable {@link #value}
    */
   @Override
   public DateTimeValue setValue(final DateTime _value)
   {
       this.value = _value;
       return this;
   }
}
