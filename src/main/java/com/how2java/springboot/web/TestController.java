package com.how2java.springboot.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.how2java.springboot.pojo.Product;
  
@Controller
public class TestController {
  
    @RequestMapping("/test")
    public String test(Model m) {
        String htmlContent = "<p style='color:red'> 红色文字</p>";
        Product currentProduct =new Product(5,"product e", 200);
        boolean testBoolean = true;
        
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "yancy_01", 1));
        products.add(new Product(2, "yancy_02", 2));
        products.add(new Product(3, "yancy_03", 3));
        products.add(new Product(4, "yancy_04", 4));
        products.add(currentProduct);
        products.add(new Product(6, "yancy_04", 6));
        
        Date now = new Date();
        
        m.addAttribute("htmlContent", htmlContent);
        m.addAttribute("currentProduct", currentProduct);
        m.addAttribute("testBoolean", testBoolean);
        m.addAttribute("products", products);
        m.addAttribute("now", now);
        
        return "test";
    }
}
