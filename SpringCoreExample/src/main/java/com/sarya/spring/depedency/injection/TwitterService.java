package com.sarya.spring.depedency.injection;

public class TwitterService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to " + rec + " with Message=" + msg);
		return true;
	}

}
