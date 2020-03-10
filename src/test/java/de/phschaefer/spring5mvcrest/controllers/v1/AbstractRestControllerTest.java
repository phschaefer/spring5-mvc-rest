package de.phschaefer.spring5mvcrest.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AbstractRestControllerTest {

    public static String asJsonString(final Object o) throws Exception {
        try {
            return new ObjectMapper().writeValueAsString(o);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
