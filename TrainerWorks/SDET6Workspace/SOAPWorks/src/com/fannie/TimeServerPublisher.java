package com.fannie;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {
	public static void main(String[] args) {
		// 1st argument is the publication URL
		// 2nd argument is an SIB instance
		String serverAddress = "http://127.0.0.1:9876/nav";
		Endpoint.publish(serverAddress, 
				new TimeServerImpl());
		
		System.out.println("Server Hosted.. ");
		System.out.println(serverAddress);
	}
}