package com.how2java.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.how2java.springboot.pojo.Product;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(Model m) {
		String htmlContent = "<p style='color:red'>ÎÄ×Ö</p>";
		
		Product product = new Product(5, "yancy", 2966);
		
		m.addAttribute("htmlContent", htmlContent);
		m.addAttribute("product", product);
		
		return "test";
	}
	
	
}
