package com.roncoo.example241.controller;

import com.roncoo.example241.bean.RoncooUserLog;
import com.roncoo.example241.cache.RoncooUserLogCache;
import com.roncoo.example241.component.RoncooJavaMailComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private RoncooUserLogCache roncooUserLogCache;

	@Autowired
	private RoncooJavaMailComponent component;

	@RequestMapping(value = "mail")
	public String mail(String email) {
		component.sendMail(email);
		return "success";
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		return map;
	}

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public RoncooUserLog get(@RequestParam(defaultValue = "1") Integer id) {
		return roncooUserLogCache.selectById(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public RoncooUserLog update(@RequestParam(defaultValue = "1") Integer id) {
		RoncooUserLog bean = roncooUserLogCache.selectById(id);
		bean.setUserName("测试");
		bean.setCreateTime(new Date());
		roncooUserLogCache.updateById(bean);
		return bean;
	}

	@RequestMapping(value = "/del", method = RequestMethod.GET)
	public String del(@RequestParam(defaultValue = "1") Integer id) {
		return roncooUserLogCache.deleteById(id);
	}

}
