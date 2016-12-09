/**
 * 
 */
package com.sarya.spring.hibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Sarang Lohar
 *
 */
public class TestSpringHibernateORM {

	/**
	 * 
	 */
	public TestSpringHibernateORM() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource r = new ClassPathResource("spring-hibernate/application-context.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDao dao = (EmployeeDao) factory.getBean("d");

		Employee e = new Employee();
		e.setId(114);
		e.setName("varun");
		e.setSalary(50000);

		dao.saveEmployee(e);
	}

}
