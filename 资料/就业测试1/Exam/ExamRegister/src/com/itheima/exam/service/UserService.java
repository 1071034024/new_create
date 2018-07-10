package com.itheima.exam.service;

import java.sql.SQLException;

import com.itheima.exam.dao.UserDAO;
import com.itheima.exam.domain.User;

public class UserService {

	public void regist(User u) throws SQLException {
		UserDAO dao=new UserDAO();
		dao.saveUser(u);
	
	}
	
	public User checkUserName(String uname) throws SQLException {
		UserDAO dao=new UserDAO();
		return dao.findByUserName(uname);
	}

}
