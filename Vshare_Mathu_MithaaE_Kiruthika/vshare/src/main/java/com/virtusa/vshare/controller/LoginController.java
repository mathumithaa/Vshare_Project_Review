package com.virtusa.vshare.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtusa.vshare.model.Login;
import com.virtusa.vshare.service.LoginService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/vshare")
public class LoginController {
	@Autowired
    private LoginService service;
	
	@PostMapping("/login")
    public @ResponseBody ResponseEntity<List<Login>> openLogin(@RequestBody Login login) {
		final String className = "LoginController";
        log.info("Retrieving login details" + className);
        HttpStatus status = HttpStatus.NOT_FOUND;
        List<Login> list=null;
        try {
            list = service.openLogin(login);
            status = HttpStatus.CREATED;
        } catch (Exception e) {
            log.error("Error while logging in login details ", e);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(list, status);
        
    }
}


