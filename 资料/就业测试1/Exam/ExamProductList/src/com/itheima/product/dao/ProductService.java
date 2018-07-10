package com.itheima.product.dao;

import java.sql.SQLException;

import com.itheima.product.domain.PageBean;

public class ProductService {
	
	public PageBean getPageData(int currentPage) throws SQLException{
		ProductDAO dao=new ProductDAO();
		PageBean page=new PageBean();
		
		page.setCurrentPage(currentPage);
		
		int pageSize=5;
		page.setPageSize(pageSize);
		
		int totalCount=dao.findTotalCount();
		page.setTotalCount(totalCount);
		
		int totalPage=(totalCount%pageSize==0)?totalCount/pageSize:totalCount/pageSize+1;
		page.setTotalPage(totalPage);
		
		int startIndex=(currentPage-1)*pageSize;
		page.setData(dao.findPage(pageSize, startIndex));
		
	    return page;	
	}

}
