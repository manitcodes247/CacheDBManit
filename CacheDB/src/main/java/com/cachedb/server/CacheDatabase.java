package com.cachedb.server;

import java.util.concurrent.*;

public class CacheDatabase {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();
    private final ScheduledExecutorService cleaner = Executors.newScheduledThreadPool(1);

    public CacheDatabase() {
        cleaner.scheduleAtFixedRate(cache::clear, 60, 60, TimeUnit.SECONDS);
    }

    public void set(String key, String value) {
        cache.put(key, value);
    }

    public String get(String key) {
        return cache.get(key);
    }

    public void delete(String key) {
        cache.remove(key);
    }
}
