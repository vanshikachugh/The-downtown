package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
			
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/gallery")
	public String gallery()
	{
		return "gallery";
	}
	
	@RequestMapping("/buynow")
	public String buynow()
	{
		return "buynow";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
}
