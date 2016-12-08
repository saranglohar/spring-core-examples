/**
 * 
 */
package com.sarya;

import java.util.List;

/**
 * @author Sarang Lohar
 *
 */
public class ProxyFactoryBean {

	private Object target;
	private List interceptorNames;

	/**
	 * 
	 */
	public ProxyFactoryBean() {
		// TODO Auto-generated constructor stub
	}

	// ########################Setter and Getter######################
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public List getInterceptorNames() {
		return interceptorNames;
	}

	public void setInterceptorNames(List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}

}
