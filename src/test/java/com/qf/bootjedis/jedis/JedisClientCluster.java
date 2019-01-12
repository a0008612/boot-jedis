package com.qf.bootjedis.jedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

@Component
public class JedisClientCluster implements JedisClient{
    @Autowired
    private JedisCluster jedisCluster;

    public String set(String key,String value){
        return jedisCluster.set(key, value);
    }

    public String get(String key){
        return jedisCluster.get(key);
    }
}
