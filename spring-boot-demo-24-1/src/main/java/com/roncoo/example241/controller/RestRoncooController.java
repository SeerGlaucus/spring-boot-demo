package com.roncoo.example241.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.roncoo.example241.bean.RoncooUserLog;
import com.roncoo.example241.cache.RoncooUserLogCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author wujing
 */
@RestController
@RequestMapping(value = "/rest", method = RequestMethod.POST)
public class RestRoncooController {

	@Autowired
	private RoncooUserLogCache RoncooUserLogCache;

	@RequestMapping(value = "/update")
	public RoncooUserLog update(@RequestBody JsonNode jsonNode) {
		System.out.println("jsonNode=" + jsonNode);
		RoncooUserLog bean = RoncooUserLogCache.selectById(jsonNode.get("id").asInt(1));
		if(bean == null){
			bean = new RoncooUserLog();
		}
		bean.setUserName("测试");
		bean.setCreateTime(new Date());
		bean.setUserIp("192.168.1.1");
		RoncooUserLogCache.updateById(bean);
		return bean;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public RoncooUserLog update2(@PathVariable(value = "id") Integer id) {
		RoncooUserLog bean = RoncooUserLogCache.selectById(id);
		if(bean == null){
			bean = new RoncooUserLog();
		}
		bean.setUserName("测试");
		bean.setCreateTime(new Date());
		bean.setUserIp("192.168.1.1");
		RoncooUserLogCache.updateById(bean);
		return bean;
	}

}
