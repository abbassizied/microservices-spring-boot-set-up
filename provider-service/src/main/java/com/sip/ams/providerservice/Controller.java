package com.sip.ams.providerservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin("*")
@RequestMapping("/provider")
public class Controller {
	@GetMapping("/")
	public String index() {
		return "<center><h1>This is the Provider Service Index Page.</h1></center>";
	}

	@GetMapping("/hello")
	String hello() {
		return "Hello, World! I'm the Provider Service";
	}

	@GetMapping("/greeting")
	String greeting() {
		return "Greetings from Provider Service!";
	}
	
    @GetMapping("/displayMessage") 

    public ResponseEntity<String> showMessage(){ 

        return ResponseEntity.ok("Provider service controller executed"); 

    } 
}
