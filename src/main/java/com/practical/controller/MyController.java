package com.practical.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Inside about handler.....");
		
		model.addAttribute("name", "Umair Abdullah");
		model.addAttribute("currentDate",new Date().toLocaleString());
		return "about";				//about.html
	}
	
	//Handler for iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		
		List<String> names = List.of("Umair","Arshad","Shubham","Dilshad","Rohan");
		
		model.addAttribute("names", names);
		return "iterate";
	}
	
	//Handler for conditional statements
	@GetMapping("/condition")
	public String conditionalHandler(Model model) {
		
		System.out.println("Conditional handler executed");
		
		//for Elvis (Ternary) condition 
		model.addAttribute("isActive", true);
		
		//for If-Unless condition 
		model.addAttribute("gender", "F");
		
		////for Switch condition 
		List<Integer> list = List.of(233,45,789,145,1,65,3752);
		model.addAttribute("list", list);
		
		return "condition";
	}
	
	//Handler for including fragments
	@GetMapping("/service")
	public String serviceHandler(Model model) {
		
		model.addAttribute("title", "I like to eat Burger");
		model.addAttribute("subtitle", LocalDateTime.now().toString());
		//processing logic
		return "service";	
	}
	
	//For New About
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutNew";
	}
	
	//For New About
		@GetMapping("/contact")
		public String contact() {
			return "contact";
		}

}
