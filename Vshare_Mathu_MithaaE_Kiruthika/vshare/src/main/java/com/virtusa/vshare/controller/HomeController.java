package com.virtusa.vshare.controller;

import java.util.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

