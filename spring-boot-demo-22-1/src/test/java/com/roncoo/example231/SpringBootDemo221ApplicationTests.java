package com.roncoo.example211;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.roncoo.example211.component.RoncooAmqpComponent;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo221ApplicationTests {
	@Autowired
	private RoncooAmqpComponent roncooAmqpComponent;

	@Test
	public void send() {
		roncooAmqpComponent.send("hello world2");
	}



}
