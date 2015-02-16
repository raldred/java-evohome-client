package com.watchforstock.evohome;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {
 
    final ObjectMapper defaultObjectMapper;
 
    public ObjectMapperProvider() {
        defaultObjectMapper = createDefaultMapper();
    }
 
    @Override
    public ObjectMapper getContext(Class<?> type) {
        return defaultObjectMapper;
    }

 
    private static ObjectMapper createDefaultMapper() {
        final ObjectMapper result = new ObjectMapper();
        result.setPropertyNamingStrategy(
        	    PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
     //   result.configure(com.fasterxml.jackson.core.JsonGenerator.Feature.INDENT_OUTPUT, true);
 
        return result;
    }
 
    // ...
}
