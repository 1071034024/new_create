package com.itheima.exam.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.exam.domain.User;
import com.itheima.utils.DataSourceUtils;

public class UserDAO {

	public void saveUser(User u) throws SQLException {
         QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
         qr.update("insert into users values(null,?,?,?,?,?,?)",u.getUname(),u.getPwd(),u.getEmail(),u.getName(),u.getSex(),u.getTelephone());
	}
	
	
	public User findByUserName(String uname) throws SQLException {
        QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
        User existsUser=qr.query("select * from users where uname=?",new BeanHandler<User>(User.class),uname);
	    return existsUser;
	}
	
	

}
