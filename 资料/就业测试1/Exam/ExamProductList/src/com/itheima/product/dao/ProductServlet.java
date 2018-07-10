package com.itheima.product.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.PageBean;
import com.itheima.utils.BaseServlet;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

    public String doFindPage(HttpServletRequest request, HttpServletResponse response){
    	
    	String current=request.getParameter("currentPage");
    	if(current==null){
    		current="1";
    	}
    	
    	ProductService service=new ProductService();
    	try {
			PageBean pageBean=service.getPageData(Integer.parseInt(current));
			request.setAttribute("pageBean", pageBean);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return "/page.jsp";
    	
    }
}
