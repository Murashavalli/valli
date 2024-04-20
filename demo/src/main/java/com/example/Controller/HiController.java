package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HiController
{
	/*@GetMapping("/hi")
	public String Hai()
	{
		return "Welcome to SpringBoot";
	}*/

	@GetMapping("/hi")
	public String sayHai()
	{
		return "Welcome to SpringBoot";
	}
}
