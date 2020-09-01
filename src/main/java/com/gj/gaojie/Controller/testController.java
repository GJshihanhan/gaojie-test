package com.gj.gaojie.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/didi")
public class testController {

	@GetMapping("/add")
	public String add(){
		//返回OK

		return "OK";

	}
}
