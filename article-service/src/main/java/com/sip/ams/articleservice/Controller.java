package com.sip.ams.articleservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity; 

@RestController
@RequestMapping("/article")
@CrossOrigin("*")
public class Controller {
	@GetMapping("/")
	public String index() {
		return "<center><h1>This is the Article Service Index Page.</h1></center>";
	}

	@GetMapping("/hello")
	String hello() {
		return "Hello, World! I'm the Article Service";
	}

	@GetMapping("/greeting")
	String greeting() {
		return "Greetings from Article Service!";
	}
	
    @GetMapping("/displayMessage") 

    public ResponseEntity<String> showMessage(){ 

        return ResponseEntity.ok("Article service controller executed"); 

    } 	
}
