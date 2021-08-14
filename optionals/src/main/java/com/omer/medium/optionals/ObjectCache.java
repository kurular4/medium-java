package com.omer.medium.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum  ObjectCache {
    INSTANCE;

    private final Map<String, Object> objectMap = new HashMap<>();

    public Optional<Object> get(String key) {
        return Optional.ofNullable(objectMap.get(key));
    }

    public void add(String key, Object value) {
        objectMap.put(key, value);
    }

    public Optional<Object> delete(String key) {
        return Optional.ofNullable(objectMap.remove(key));
    }
}
