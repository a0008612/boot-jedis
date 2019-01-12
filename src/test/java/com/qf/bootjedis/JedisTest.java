package com.qf.bootjedis;

import com.qf.bootjedis.jedis.JedisClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisTest {
    @Autowired
    private JedisClient jedisClient;
    @Test
    public void test(){
        System.out.println(jedisClient.get("name"));
    }
}
