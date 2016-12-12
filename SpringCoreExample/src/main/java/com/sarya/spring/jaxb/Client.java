/**
 * 
 */
package com.sarya.spring.jaxb;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

/**
 * @author Sarang Lohar
 *
 */
public class Client {

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jaxb\\application-context.xml");
		Marshaller marshaller = (Marshaller) context.getBean("jaxbMarshallerBean");

		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Sonoo Jaiswal");
		employee.setSalary(100000);

		marshaller.marshal(employee, new StreamResult(new FileWriter("src/main/resources/spring-jaxb/out-employee.xml")));
		System.out.println("XML Created Sucessfully");

	}

}
