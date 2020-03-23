package com.wcy.lesson02.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 
* @Title: DateAction.java
* @Package com.wcy.lesson02.action
* @author 晨阳 
* @date 2020年3月16日 下午3:26:50
* @Description: 
* @version V1.0
 */
public class DateAction extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strNow = sdf.format(now);
		String name = arg0.getParameter("name");
		String str = String.format("hello %s , now is %s", name,strNow);
		PrintWriter out = arg1.getWriter();
		out.println(str);
		out.close();
	}

}
