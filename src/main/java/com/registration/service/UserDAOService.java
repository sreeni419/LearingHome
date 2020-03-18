package com.registration.service;

import org.hibernate.Session;

import com.registration.dao.HibernateUtil;
import com.registration.domain.UserDO;
import com.registration.soap.service.RegisterUserTO;

public class UserDAOService {
	public void registerUser(RegisterUserTO user) {
		Session session = HibernateUtil.openSession();
		UserDO userDo = new UserDO(user.getFirstName(), user.getLastName(), user.getUserID(), user.getPassword());
		session.beginTransaction();
		session.save(userDo);
		session.getTransaction().commit();
		session.close();
	}
}
