package com.itheima.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.exam.domain.User;
import com.itheima.exam.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String methodName=request.getParameter("method");
		if(methodName==null||"".equals(methodName)){
			response.getWriter().println("不存在的操作！！！");
			return;
		}
		
		Class cls=this.getClass();
		try {
			Method method=cls.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			String path=(String)method.invoke(this, request,response);
			if(path!=null){
				request.getRequestDispatcher(path).forward(request, response);
			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
   


}
