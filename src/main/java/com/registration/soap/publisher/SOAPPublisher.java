package com.registration.soap.publisher;

import javax.xml.ws.Endpoint;

import com.registration.soap.service.RegistrationServiceImplementaion;

public class SOAPPublisher {

	public static void main(String[] args) {
		/*Endpoint endpoint = Endpoint.create(new AuthenticationServiceImplementaion());*/
		 Endpoint.publish("http://localhost:8081/RegistrationService", new RegistrationServiceImplementaion());
	}

}

