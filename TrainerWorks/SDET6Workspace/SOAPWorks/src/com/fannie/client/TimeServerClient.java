package com.fannie.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.fannie.TimeServer;
// client for SOAP 
public class TimeServerClient {
	public static void main(String[] args) 
			throws MalformedURLException {
		URL url = new URL("http://127.0.0.1:9876/nav?WSDL");
		
		String serviceName="TimeServerImplService";
		String portInfo="http://fannie.com/";
		
		QName qname = new QName(portInfo, serviceName);
		
		Service service = Service.create(url, qname);
		
		TimeServer timeServerObj = service.getPort(TimeServer.class);
		
		System.out.println("Credit score checking " + timeServerObj.checkCreditScore("Harry", 444));
		
		
	}
}
