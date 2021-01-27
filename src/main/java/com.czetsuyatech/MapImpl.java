package com.czetsuyatech;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @version 0.0.1
 * @since 0.0.1
 */
public class MapImpl implements Map {

    private List<Entry<String, Object>> values = new ArrayList();

    public void put(String key, Object value) {

        boolean exists = values.stream().filter(e -> e.getKey().equals(key)).findAny().isPresent();
        if (exists) {
            values.removeIf(e -> e.getKey().equals(key));
        }

        values.add(new Entry(key, value));
    }

    public Object get(String key) {

        return values.stream().filter(e -> e.getKey().equals(key)).findFirst().map(e -> e.getValue()).orElse(null);
    }
}
