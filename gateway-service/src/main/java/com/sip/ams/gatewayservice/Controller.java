package com.sip.ams.gatewayservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {
	@GetMapping("/")
	public String index() {
		return "<center><h1>This is the GateWay Service Index Page.</h1></center>";
	}
}
