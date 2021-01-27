package com.czetsuyatech;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @version 0.0.1
 * @since 0.0.1
 */
public class Entry<K, V> {

    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
