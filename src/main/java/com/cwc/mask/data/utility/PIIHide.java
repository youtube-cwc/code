package com.cwc.mask.data.utility;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class PIIHide extends JsonSerializer {
    @Override
    public void serialize(Object object, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        String pii = object.toString().replaceAll("\\w(?=\\w{4})", "x");
        jsonGenerator.writeString(pii);

    }
}
