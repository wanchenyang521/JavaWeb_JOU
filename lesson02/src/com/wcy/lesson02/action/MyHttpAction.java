package com.wcy.lesson02.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
* @Title: MyHttpAction.java
* @Package com.wcy.lesson02.action
* @author 晨阳 
* @date 2020年3月16日 下午3:52:25
* @Description: 
* @version V1.0
 */
public class MyHttpAction extends HttpServlet {

	/**
	 * 通过浏览器地址栏发起的请求是GET请求
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("this is a get request! Warring you can not use get");
		out.close();
	}

	/**
	 * 通过表单提交
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		PrintWriter out = resp.getWriter();
		out.println("this is a post request");
	  	String username = req.getParameter("username");
	  	String password = req.getParameter("password");
	  	
		String numberone = req.getParameter("numberone");
	  	String numbertwo = req.getParameter("numbertwo");
	  
	  	Integer num1 = Integer.parseInt(numberone);
	  	Integer num2 = Integer.parseInt(numbertwo);
	  	
	  	Integer result = num1 + num2;
	  	
	  	out.println("username:"+username);
	  	out.println("password:"+password);
	  	out.println(numberone+" + "+ numbertwo +" = " + result  );
	  	
	  	
		out.close();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPut(req, resp);
		PrintWriter out = resp.getWriter();
		out.println("this is a put request");
		out.close();
	}
	

}
