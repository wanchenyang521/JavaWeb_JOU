package com.wcy.demo.util;

import java.sql.ResultSet;

public interface DbOptable {
	public void connect();
	public ResultSet query(String sql);
	public void close();
}
