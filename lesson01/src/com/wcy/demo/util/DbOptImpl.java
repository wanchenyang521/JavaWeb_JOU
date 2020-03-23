package com.wcy.demo.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbOptImpl implements DbOptable {
	private static String DRIVER;
	private static String URL ;
	private static String USERNAME;
	private static String PASSWORD;
	public Connection conn;
	
	static {
		Properties props = new Properties();
//		从当前类的类路径下读取文件
//		InputStream is =  DbOptImpl.class.getResourceAsStream("conn_db.properties");
		String path = "F:/JavaWeb/lesson01/src/conn_db.properties";
		try {
//			从文件流中加载资源
			FileInputStream fis = new FileInputStream(path);
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DRIVER = props.getProperty("DRIVER");
		URL = props.getProperty("URL");
		USERNAME = props.getProperty("USERNAME");
		PASSWORD = props.getProperty("PASSWORD");
	}
	
	@Override
	public void connect(){
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
			conn =  DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet query(String sql) {
		// TODO Auto-generated method stub
		Statement stm ;
		ResultSet rs = null;
		try {
			stm = conn.createStatement();
			 rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		DbOptImpl dbo = new DbOptImpl();
		dbo.connect();
		System.out.println(DRIVER);
		
	}
	
}
