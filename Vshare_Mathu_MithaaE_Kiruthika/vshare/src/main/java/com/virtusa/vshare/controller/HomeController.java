package com.virtusa.vshare.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/vshare")
public class HomeController {
	
	@RequestMapping("/")	
	public ModelAndView login(){
	return new ModelAndView("homepage");
	}
		
	@RequestMapping("/watch list")
	public ModelAndView watchlist() {
	    return new ModelAndView("watch list");
	    }
	
	@RequestMapping("/hometab2")
	public ModelAndView company_description() {
		return new ModelAndView("hometab2");
		} 
	
	@RequestMapping("/hometab1")
	public ModelAndView about_account() {
		return new ModelAndView("hometab1");
		} 
	
	@RequestMapping("/homepage")	
	public ModelAndView home(){
	return new ModelAndView("homepage");
	}
	
	
}

