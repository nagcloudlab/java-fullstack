package com.example.web;

import com.example.framework.RequestMapping;
import com.example.framework.RequestMethod;
import com.example.framework.RestController;

@RestController("myController")
public class MyController {
	
	// /api/xxx
	@RequestMapping(value="/api/xxx",method = RequestMethod.GET)
	public String doXXX() {
		System.out.println("doXXX");
		return "happy week";
	}

}
