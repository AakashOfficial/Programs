package com.tyagi.EcommerceBackend.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyagi.EcommerceBackend.model.*;

@Repository("userDAO")
public class UserDAO 
{
@Autowired
SessionFactory sessionFactory;
public UserDAO(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
@Transactional
public void insertUpdateUser(UserRegister user)
{
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(user);
}

public UserRegister getUser(int userid)
{
	Session session=sessionFactory.openSession();
	UserRegister user=(UserRegister)session.get(UserRegister.class,userid);
	session.close();
	return user;
}
@Transactional
public void deleteUser(UserRegister user)
{
	sessionFactory.getCurrentSession().delete(user);
}

public List<UserRegister> getUserDetails()
{
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from User");
	List<UserRegister> list=query.list();
	session.close();
	return list;
}


}
