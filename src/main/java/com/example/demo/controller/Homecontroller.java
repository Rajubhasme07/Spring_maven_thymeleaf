package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Customer;

@Controller
public class Homecontroller {
	
//	this method for just checking how requestMapping and Response body worked
	@RequestMapping("/test")
	@ResponseBody
	String testfun() {
		
		return "page create using thymeleaf" ;
	}
	
//	this method hits the url-test1 and redirected to page1
	@RequestMapping("/test1")
	String testfun1() {
		return "page1";
	}
	
//	this method hits the url-test2 and redirected to page2 with data
	@RequestMapping("/test2")
	String testfun2(Model model) {
		model.addAttribute("name","Raj Bhasme");
		return "page2";
	}
	
//	this method hits the url-test3 and redirected to page3 with data through object
	@RequestMapping("/test3")
   String objfun(Model model) {
	   Customer c=new Customer("Ankit","Shirt");
	   model.addAttribute("obj",c);
	   return "page3";
   }
//	this method hits the url-test4 and redirected to page4 with null object for form to insert data
	@RequestMapping("/test4")
	String nullobj(Model model) {
		Customer c=new Customer();
		model.addAttribute("obj",c);
		return "page4";
	}
	
//	this method hits the url-add and redirected to page5 with data through modelattribute obj and show data
	@RequestMapping("/add")
	String getdata(@ModelAttribute("obj") Customer c) {

//		System.out.println("Came"+c.getCname());
//		System.out.println("a"+c.getCpr());
		return "page5";
	}
	
	
}
