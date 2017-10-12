package com.roncoo.example171.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

/**
 * @author wujing
 */
@Component
public class RoncooRedisComponent {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	JedisPool jedisPool;

	public void set(String key, String value) {

		jedisPool.getResource().setex("test1", 1000, "Hello World!");

		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
		if (!this.stringRedisTemplate.hasKey(key)) {
			ops.set(key, value);
			System.out.println("set key success");
		} else {
			// 存在则打印之前的value值
			System.out.println("this key = " + ops.get(key));
		}
	}

	public String get(String key) {
		return this.stringRedisTemplate.opsForValue().get(key);
	}

	public void del(String key) {
		this.stringRedisTemplate.delete(key);
	}
}
