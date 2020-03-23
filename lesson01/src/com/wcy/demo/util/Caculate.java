package com.wcy.demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Caculate {
	public static void main(String[] args) {
		DbOptable dbt = new DbOptImpl();
		dbt.connect();
		ResultSet rs =  dbt.query("select * from customer");
		// 获取数据并显示
		try {
			while( rs.next() ){
				String customername = rs.getString(2);
				System.out.println(customername);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbt.close();
	}

}
