package com.czetsuyatech;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @version 0.0.1
 * @since 0.0.1
 */
public class MapImplTest {

    private static Map mapOfValues = new MapImpl();

    @BeforeAll
    private static void init() {
        mapOfValues.put("1", "Edward");
        mapOfValues.put("2", "Kerri");
        mapOfValues.put("3", "Glaiza");
    }

    @Test
    void whenMapGetOk() {
        assertEquals("Edward", mapOfValues.get("1"));
        assertEquals("Kerri", mapOfValues.get("2"));
        assertEquals("Glaiza", mapOfValues.get("3"));
        assertEquals(null, mapOfValues.get("4"));
    }

    @Test
    void whenMapGetKo() {
        assertNotEquals("Kerri", mapOfValues.get("4"));
        assertNotEquals("Kerri", mapOfValues.get("1"));
    }

    @Test
    void whenMapAddOk() {
        mapOfValues.put("5", "Rinoa");
        assertEquals("Rinoa", mapOfValues.get("5"));
        mapOfValues.put("6", "Tifa");
        assertEquals("Tifa", mapOfValues.get("6"));
        mapOfValues.put("5", "Aerith");
        assertEquals("Aerith", mapOfValues.get("5"));
    }
}
