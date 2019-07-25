package com.tricon.SNS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sns")
public class SNSController {

	@Autowired
	private SNSMessageSender messageSender;

	@PostMapping("/send")
	public void sendMsg() {
		messageSender.send("tricon", "test message", "notification ");
		System.out.println( "done");
	}
}
