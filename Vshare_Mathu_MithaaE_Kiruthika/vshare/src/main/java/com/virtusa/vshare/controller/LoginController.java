package com.virtusa.vshare.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtusa.vshare.model.Login;
import com.virtusa.vshare.service.LoginService;


import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/vshare")
public class LoginController        {
	@Autowired
    private LoginService service;
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("login");
	}
	
	/*
	 * @RequestMapping(value="/login validate") public ModelAndView
	 * test(HttpServletRequest req , HttpServletResponse res) throws IOException{
	 * try{ String uname = req.getParameter("username"); String pass =
	 * req.getParameter("password"); Class.forName("com.mysql.jdbc.Driver"); //
	 * MySQL database connection Connection conn=DriverManager.getConnection(
	 * "jdbc:mysql://localhost:3306/vshare","root","mathudb"); PreparedStatement ps
	 * = conn.
	 * prepareStatement("Select username,password from vshare.login_details where username=? and password=?"
	 * ); ps.setString(1, uname); ps.setString(2, pass); ResultSet rs =
	 * ps.executeQuery();
	 * 
	 * if(rs.next()) { return new ModelAndView("homepage"); }
	 * 
	 * else { return new ModelAndView("retry_login");
	 * 
	 * } } catch(Exception e){ System.out.print(e); return new
	 * ModelAndView("retry_login"); }
	 * 
	 * }
	 */
	
	@PostMapping("/search")
    public @ResponseBody ResponseEntity<List<Login>> searchResource(@RequestBody Login login) {
        log.info("Retrieving list of Employees");
        HttpStatus status = HttpStatus.NOT_FOUND;
        List<Login> list=null;
        try {
            list = service.searchResource(login);
            status = HttpStatus.CREATED;
        } catch (Exception e) {
            log.error("Error while logging in Employee details ", e);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(list, status);
        
    }
}


