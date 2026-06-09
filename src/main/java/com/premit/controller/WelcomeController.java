package com.premit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@ResponseBody
	@RequestMapping(path="/welcome", method = {RequestMethod.GET,RequestMethod.POST})
	public String printWelcomeMessageOne() {
		return "Welcome to PremIT, Happy to see you.";
	}
	
}
