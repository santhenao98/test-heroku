package com.bbva.mensajeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MensajeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MensajeriaApplication.class, args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
}
