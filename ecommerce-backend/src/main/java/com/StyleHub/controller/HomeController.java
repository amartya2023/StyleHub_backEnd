package com.StyleHub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StyleHub.response.ApiResponse;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<ApiResponse> homeController(){
		
		ApiResponse res = new ApiResponse("Welcome to E-Commerce System", true);
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
