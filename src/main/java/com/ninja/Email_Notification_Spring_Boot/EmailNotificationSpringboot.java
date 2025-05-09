package com.ninja.Email_Notification_Spring_Boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailNotificationSpringboot {

	@RequestMapping("/test")
	public String test()
	{
		return "This is test Ghost Page";
	}
	

	@RequestMapping("/email")
	public String email()
	{
		return "This is test Email Notification Page";
	}
}
