/**
 * 
 */
package com.sarya.spring.depedency.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sarang Lohar
 *
 */
@Configuration
@ComponentScan(value = { "com.sarya.spring.depedency.injection" })
public class DIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
}
