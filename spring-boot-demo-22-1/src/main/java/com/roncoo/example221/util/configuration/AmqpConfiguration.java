package com.roncoo.example211.util.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * amqp 队列配置
 * 
 * @author wujing
 */
@Configuration
public class AmqpConfiguration {

	@Bean
	public Queue queue() {
		return new Queue("roncoo.queue");
	}

}
