package com.tricon.SNS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class SNSMessageSender {

	@Autowired
	private NotificationMessagingTemplate messagingTemplate;
	
	public void send(String topicName,Object message,String subject)
	{
		messagingTemplate.sendNotification(topicName, message, subject);
	}
}
