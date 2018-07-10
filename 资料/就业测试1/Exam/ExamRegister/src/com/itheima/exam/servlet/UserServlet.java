package com.itheima.exam.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.exam.domain.User;
import com.itheima.exam.service.UserService;
import com.itheima.utils.BaseServlet;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	public String regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String path="/success.jsp";
		User u=new User();
		try {
			BeanUtils.populate(u, request.getParameterMap());
			UserService service=new UserService();
			service.regist(u);	
		} catch (IllegalAccessException|InvocationTargetException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			request.setAttribute("msg","注册失败，重新填写");
			path="/";
		}
		return path;
	}
	
	
	public String checkUserName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String uname=request.getParameter("uname");
		 UserService service=new UserService();
		 try {
			User existsUser=service.checkUserName(uname);
			if(existsUser==null){
				response.getWriter().print("0");
			}else{
				response.getWriter().print("1");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}

	

}
