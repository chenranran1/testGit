package com.trs.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@RequestMapping("test")
	public Object test() {
		System.err.println("成员2修改的内容");
		System.err.println("成员1修改的内容");
		return "测试控制器";
	}
}
