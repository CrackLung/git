	package com.dao.impls;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import com.beans.Product;
import com.daos.ProductDao;
import com.ntg.utils.ResultsSetUtil;
import com.utils.JdbcUtil;

public class ProductDaoImpl extends JdbcUtil  implements ProductDao{
	@Override
	public int add(Product t) {
		String sql ="insert into product(name,description,price,stock,categoryLevel1Id,categoryLevel2Id,categoryLevel3Id) values(?,?,?,?，?,?,?,?，?,?)";
		Object [] object={t.getName(),t.getDescription(),t.getPrice(),t.getStock(),t.getCategoryLevel1id(),t.getCategoryLevel2id(),t.getCategoryLevel3id()};
		int result=0;
		try {
			result=executeUpdate(sql, object);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int delete(Serializable t) {
		String sql="delete from product where id=?";
		int result=0;
		Object[] object={t};
		try {
			result=executeUpdate(sql, object);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updata(Product t) {
		int result=0;
		String sql="update product set name=?,description=?,price=?,stock=? where id=?";
		Object[] objects={t.getName(),t.getDescription(),t.getPrice(),t.getStock(),t.getId()};
		try {
			result=executeUpdate(sql,objects);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Product> select() {
		String sql="select * from product";
		List<Product > list =null;
		try {
			resultSet=executeQuery(sql);
			list=ResultsSetUtil.findAll(resultSet,Product.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Product findById(Serializable t) {
		// TODO Auto-generated method stub
		return null;
	}
}
