package com.dao.impls;

import java.io.Serializable;
import java.util.List;

import com.beans.ShoppingCart;
import com.daos.ShoppingCartDao;
import com.utils.JdbcUtil;

public class ShoppingCartDaoImpl extends JdbcUtil implements ShoppingCartDao{

	@Override
	public int add(ShoppingCart t) {
		return 0;
	}

	@Override
	public int delete(Serializable t) {
		return 0;
	}

	@Override
	public int updata(ShoppingCart t) {
		return 0;
	}

	@Override
	public List<ShoppingCart> select() {
		return null;
	}

	@Override
	public ShoppingCart findById(Serializable t) {
		return null;
	}

}
