package com.how2java.springboot.web;
<<<<<<< HEAD
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.how2java.springboot.pojo.Product;
  
@Controller
public class TestController {
  
    @RequestMapping("/test")
    public String test(Model m) {
        String htmlContent = "<p style='color:red'> çº¢è‰²æ–‡å­—</p>";
        Product currentProduct =new Product(5,"product e", 200);
        boolean testBoolean = true;
        
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "yancy_01", 1));
        products.add(new Product(2, "yancy_02", 2));
        products.add(new Product(3, "yancy_03", 3));
        products.add(new Product(4, "yancy_04", 4));
        products.add(currentProduct);
        products.add(new Product(6, "yancy_04", 6));
        
        m.addAttribute("htmlContent", htmlContent);
        m.addAttribute("currentProduct", currentProduct);
        m.addAttribute("testBoolean", testBoolean);
        m.addAttribute("products", products);
        
        return "test";
    }
}
=======

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
		
		boolean flag = true;
		
		m.addAttribute("htmlContent", htmlContent);
		m.addAttribute("product", product);
		m.addAttribute("flag", flag);
		return "test";
	}
	
	
}
>>>>>>> branch 'master' of https://github.com/Ca1m/thymeleaf.git
