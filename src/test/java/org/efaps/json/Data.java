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

package org.efaps.json;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.efaps.json.data.DataList;
import org.efaps.json.data.DecimalValue;
import org.efaps.json.data.LongValue;
import org.efaps.json.data.ObjectData;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * TODO comment!
 *
 * @author The eFaps Team
 * @version $Id$
 */
public class Data
{

    @Test
    public void one()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JodaModule());
        final String INPUT_JSON = "{\"start\" : \"1972-12-28T12:00:01.000Z\"}";
        final Bean bean = mapper.readValue(INPUT_JSON, Bean.class);
        System.out.println(bean);
    }

    @Test
    public void two()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());

        final Bean bean = new Bean();
        bean.start = new DateTime();
        mapper.writeValue(System.out, bean);
    }


    @Test
    public void bigdecimal()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());

        final Bean bean = new Bean();
        bean.bigdecimal = new BigDecimal("12593.2356");
        mapper.writeValue(System.out, bean);
    }


    @Test
    public void bigdecimalread()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());
        final String INPUT_JSON = "{\"bigdecimal\" : 12593.2356}";

        final Bean bean = mapper.readValue(INPUT_JSON, Bean.class);
        System.out.println(bean);
    }

    @Test
    public void bigdecimalread2()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());
        final String INPUT_JSON = "{\"bigdecimal\" : 12593}";

        final Bean bean = mapper.readValue(INPUT_JSON, Bean.class);
        System.out.println(bean);
    }

    @Test
    public void map1()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());

        final List<Bean> beans = new ArrayList<>();
        final Bean bean = new Bean();
        bean.bigdecimal = new BigDecimal("12593.2356");
        beans.add(bean);
        final Bean bean2 = new Bean();
        bean2.start = new DateTime();
        beans.add(bean2);
        mapper.writeValue(System.out, beans);
    }

    @Test
    public void object1()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());

        final ObjectData data = new ObjectData();
        final DecimalValue value = new DecimalValue();
        value.setValue(new BigDecimal("12593.2356"));
        value.setKey("Hallo");
        data.getValues().add(value);

        final LongValue value2 = new LongValue();
        value2.setValue(new Long(12593));
        value2.setKey("Demo");
        data.getValues().add(value2);
        mapper.writeValue(System.out, data);
    }

    @Test
    public void objects()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {

        final ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);

        mapper.registerModule(new JodaModule());

        final DataList dataList = new DataList();
        final ObjectData data = new ObjectData();
        final DecimalValue value = new DecimalValue();
        value.setValue(new BigDecimal("12593.2356"));
        value.setKey("Hallo");
        data.getValues().add(value);

        final LongValue value2 = new LongValue();
        value2.setValue(new Long(12593));
        value2.setKey("Demo");
        data.getValues().add(value2);

        dataList.add(data);

        final ObjectData data2 = new ObjectData();
        final DecimalValue value3 = new DecimalValue();
        value3.setValue(new BigDecimal("12593.2356"));
        value3.setKey("Hallo");
        data2.getValues().add(value3);

        final LongValue value4 = new LongValue();
        value4.setValue(new Long(12593));
        value4.setKey("Demo");
        data2.getValues().add(value4);
        dataList.add(data2);

        mapper.writeValue(System.out, dataList);
    }


    @Test
    public void objectsIn()
        throws ParseException, JsonParseException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        mapper.registerModule(new JodaModule());

        final DataList bean = mapper.readValue(Data.class.getResourceAsStream("ObjectIn.json"), DataList.class);
        System.out.println(bean);
    }


    public static class Bean
    {
        public DateTime start;

        public BigDecimal bigdecimal;
    }
}
