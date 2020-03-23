package com.wcy.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wcy.demo.util.DbOptImpl;
import com.wcy.demo.util.DbOptable;
import com.wcy.demo.vo.Product;

public class ProductDaoImpl implements ProductDao {
	DbOptable dbo = new DbOptImpl();
	@Override
	public List<Product> findAll() {
		List<Product> list = new ArrayList<Product>();
		dbo.connect();
		ResultSet rs = dbo.query("SELECT * FROM product");
		try {
			while(rs.next()){
				Product pro = null;
				try {
					pro = new Product(rs.getString(1), rs.getString(2), rs.getString(5));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.add(pro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
