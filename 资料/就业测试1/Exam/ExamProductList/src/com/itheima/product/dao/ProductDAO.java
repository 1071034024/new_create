package com.itheima.product.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.product.domain.Product;
import com.itheima.utils.DataSourceUtils;

public class ProductDAO {
	
	
	public int findTotalCount() throws SQLException{
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		Long count=(Long)qr.query("select count(*) from product",new ScalarHandler());
		return count.intValue();
	}
	
	public List<Product> findPage(int pageSize,int startIndex) throws SQLException{
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		List<Product> list=qr.query("select * from product limit ?,?",new BeanListHandler<Product>(Product.class),startIndex,pageSize);
		return list;
	}

}
