package com.wcy.lesson02.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
* @Title: HelloAction.java
* @Package com.wcy.lesson02.action
* @author 晨阳 
* @date 2020年3月16日 下午2:48:49
* @Description: 
* @version V1.0
 */
public class HelloAction implements Servlet {
	ServletConfig config;
	
	/**
	 * servlet 创建的时候执行
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("HelloAction init 创建");
		this.config = config;
		
	}

	/**
	 * servlet 销毁的时候
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("HelloAction destory 销毁");
		
	}
	/**
	 * 获取ServletConfig对象
	 */

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "这是一个HelloServlet,作者是晨阳";
	}


	/**
	 * 接受用户请求，并作出响应
	 */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		out.println("hello wcy:"+name);
		out.close();
		
	}

}
