package com.registration.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RegistrationServiceAPI {

	@WebMethod
	public String registerUser(RegisterUserTO user);

}
