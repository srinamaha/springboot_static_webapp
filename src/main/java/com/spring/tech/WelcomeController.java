package com.spring.tech;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	 @RequestMapping(value="/")   
     public String getIndex(Model model, HttpServletRequest request){
         return "index";
     }

}
