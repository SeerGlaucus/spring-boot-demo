package com.roncoo.example171.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

@Configuration
public class jedisConfig {

    @Value("${spring.redis.host}")
    private String ip;

    @Value("${spring.redis.port}")
    private int port;

    @Bean
    public JedisPool jedisFactory(){
        return new JedisPool(ip, port);
    }

}
