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
 * @Configuration annotation is used to let Spring know that it’s a
 *                Configuration class.
 * @ComponentScan annotation is used with @Configuration annotation to specify
 *                the packages to look for Component classes.
 * @Bean annotation is used to let Spring framework know that this method should
 *       be used to get the bean implementation to inject in Component classes.
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
