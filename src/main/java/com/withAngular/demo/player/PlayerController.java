package com.withAngular.demo.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// using controller
/*
 * @Controller public class PlayerController {
 * 
 * 
 * @RequestMapping(value = "/message") // localhost:8080/message
 * 
 * @ResponseBody // because controller only accept by this type of data formats
 * public String getMessage() { return "Hi there"; } }
 */

// using restcontroller it is not require response body
@RestController
public class PlayerController {
	
	// inject to playerservice
	@Autowired
	private PlayerService playerservice;
	
	
	@RequestMapping(value = "/message") // localhost:8080/message
	// @ResponseBody // because controller only accept by this type of data formats
	public String getMessage() {
		return "Hi there";
	}
}

