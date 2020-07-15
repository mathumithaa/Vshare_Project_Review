package com.virtusa.vshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.vshare.model.Login;
import com.virtusa.vshare.service.RegisterService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/vshare")
public class RegisterController {
	@Autowired
    private RegisterService service;
	
	@PostMapping("/register")
    public @ResponseBody ResponseEntity<Login> registerUser(@RequestBody Login register) {
		final String className = "RegisterController";
        log.info("Saving Registeration details" + className);
        HttpStatus status = HttpStatus.NOT_FOUND;
        Login list=null;
        try {
            list = service.registerUser(register);
            status = HttpStatus.CREATED;
        } catch (Exception e) {
            log.error("Error while registering ", e);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(list, status);
        
    }
}
