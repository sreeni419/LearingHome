package com.registration.soap.service;

import java.util.List;

import javax.jws.WebService;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.registration.dao.HibernateUtil;
import com.registration.domain.UserDO;
import com.registration.service.UserDAOService;

@WebService(endpointInterface = "com.registration.soap.service.RegistrationServiceAPI")
public class RegistrationServiceImplementaion implements RegistrationServiceAPI {

	public RegistrationServiceImplementaion() {

	}

	

	@Override
	public String registerUser(RegisterUserTO user) {
		try {
			if (user.getPassword().equals(user.getRepeatPassword())) {
				UserDAOService userDaoService = new UserDAOService();
				userDaoService.registerUser(user);
			} else {
				System.out.println("Password not matched");
				return "Please repeat Same Password and try";
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Failed";
		}
		return "Success";
	}
}
