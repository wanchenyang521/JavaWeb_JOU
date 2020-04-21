package com.wcy.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wcy.vo.Student;

@WebServlet("/login.do")
public class LoginAction extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String errorMsg = null;
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String code = req.getParameter("code");
		String scode = (String) session.getAttribute("scode");
		if(!name.endsWith("tom")){
			errorMsg = "No such user";
		}
		if(!"123".equals(password)){
			errorMsg = "passwrod is error!!!";
		}
		if(!code.equals(scode)){
			errorMsg = code+"validate code is error!!!"+scode;
		}
		req.setAttribute("errorMsg", errorMsg);
		if(errorMsg == null){
			// 两种跳转页面的方式
			// 1. redirect 将重启一个请求（上个请求就结束）
//			resp.sendRedirect("error.jsp");
			// 2. forword方式。将当前请求延申下去
			req.setAttribute("username", name);
			Student stu = new Student("万晨阳",22,"软件工程");
			Student stu2 = new Student("万晨阳session",212,"软件工程2");
			req.setAttribute("stu", stu);
			session.setAttribute("stu", stu2);
			req.setAttribute("field", "age");
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("error.jsp").forward(req, resp);
//			resp.sendRedirect("error.jsp");
		}
	}
	

}
