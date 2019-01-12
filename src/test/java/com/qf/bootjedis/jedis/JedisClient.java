package com.qf.bootjedis.jedis;

public interface JedisClient {
    String set(String key,String value);
    String get(String key);
}
