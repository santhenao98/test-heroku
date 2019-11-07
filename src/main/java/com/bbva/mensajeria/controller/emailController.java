package com.bbva.mensajeria.controller;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.mensajeria.model.EmailModel;
import com.bbva.mensajeria.service.BuildEmailService;

@RestController
@RequestMapping(value = "/customerLaekNotification")
public class emailController {

	/*
	 * 200 409 500 404
	 * 
	 */

	@Autowired
	private BuildEmailService buildEmailService;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public ResponseEntity sendEmail(@RequestBody EmailModel emailModel)
			throws MailException, MessagingException, IOException, URISyntaxException {

		System.out.println("llegue al post: " + emailModel.toString());
		buildEmailService.buildEmail(emailModel);

		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {

		return "Hello World!!";
	}

}
