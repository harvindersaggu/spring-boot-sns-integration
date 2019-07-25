package com.tricon.SNS;

import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.sns.AmazonSNS;

@Configuration
public class CloudAwsConfig {

	@Bean
	public NotificationMessagingTemplate  notificationMessageingTemplate(AmazonSNS amazonSNS)
	{
		return new NotificationMessagingTemplate(amazonSNS);
	}
}
