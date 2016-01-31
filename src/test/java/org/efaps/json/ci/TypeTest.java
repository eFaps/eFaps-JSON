/*
 * Copyright 2003 - 2015 The eFaps Team
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
package org.efaps.json.ci;

import java.io.IOException;
import java.util.UUID;

import org.efaps.json.AbstractEFapsJSON;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * The Class TypeTest.
 *
 * @author The eFaps Team
 */
public class TypeTest
{

    /**
     * Type test.
     *
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonGenerationException
     */
    @Test
    public void typeTest()
        throws JsonGenerationException, JsonMappingException, IOException
    {
        final Type type = new Type()
                .setName("typename")
                .setUUID(UUID.fromString("c97a8323-14b4-4a71-9095-20d864babcef"))
                .setId(200)
                .addAttribute(new Attribute().setName("OID"))
                .addAttribute(new Attribute().setName("Name"));

        final ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(System.out, type);
    }

    @Test
    public void typeReadTest()
        throws JsonGenerationException, JsonMappingException, IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());

        final Object bean = mapper.readValue(TypeTest.class.getResourceAsStream("Type.json"), AbstractEFapsJSON.class);
        Assert.assertTrue(bean instanceof Type);
    }

}
