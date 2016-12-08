/**
 * 
 */
package com.sarya.spring.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Sarang Lohar
 *
 */
public class TestSpringAOP {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring-aop.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		A a = factory.getBean("proxy", A.class);
		a.m("Sarang Lohar");
		System.out.println("In main method");

		A v = factory.getBean("proxyValidate", A.class);
		try {
			v.validate(12);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
