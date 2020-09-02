package com.ms.RestAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

	@GetMapping("/Hi/{name}")
	public String helloWorld(@PathVariable("name") String name) {
		
		
		return "Hello World!!"+ name;
	}
	
	@GetMapping("/Bye/{name}")
	public String byeWorld(@PathVariable("name") String name) {
		
		
		return "Bye World!!"+ name;
	}
	
	
}
