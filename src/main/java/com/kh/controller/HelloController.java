package com.kh.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	@RequestMapping("hi")
	@ResponseBody
	public String hi() {
		return "Hello, world.";
	}

}
