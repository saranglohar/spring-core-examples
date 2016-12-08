/**
 * 
 */
package com.sarya;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Sarang Lohar
 *
 */

public class Test {

	@Autowired
	static Student student;

	public static void main(String[] args) {
		System.out.println("____________Get bean using IOC Container BeanFactory___________________");
		Resource resource = new ClassPathResource("spring-beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		student = (Student) factory.getBean("studentbean");
		Student student1 = (Student) factory.getBean("studentbean");
		student1.setName("ashish barde");
		student.displayInfo();
		student1.displayInfo();

		System.out.println("____________Get bean using IOC Container ApplicationContext___________________");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Student s1 = (Student) context.getBean("studentbean");
		s1.displayInfo();

	}
}