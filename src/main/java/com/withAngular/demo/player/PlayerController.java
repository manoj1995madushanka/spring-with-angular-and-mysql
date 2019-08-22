package com.withAngular.demo.player;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayerController {
	
	
	@RequestMapping(value = "/message") // localhost:8080/message
	@ResponseBody // because controller only accept by this type of data formats
	public String getMessage() {
		return "Hi there";
	}
}
