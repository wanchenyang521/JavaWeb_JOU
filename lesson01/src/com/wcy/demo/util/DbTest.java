package com.wcy.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ��������
			// ��������
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("org.apache.derby.jdbc.ClientDriver");
//		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/x?useUnicode=true&characterEncoding=UTF-8","root","123456");
		Connection conn =  DriverManager.getConnection("jdbc:derby://localhost:1527/myeclipse","classiccars","classiccars");
//		org.apache.derby.jdbc.ClientDriver
		// ִ�в�ѯSQL
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery("SELECT * FROM CUSTOMER");
		// ��ȡ���ݲ���ʾ
		while( rs.next() ){
			String customername = rs.getString(2);
			System.out.println(customername);	
		}
		rs.close();
		stm.close();
		conn.close();
	}

	
}
