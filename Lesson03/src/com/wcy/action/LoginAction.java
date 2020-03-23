package com.wcy.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.do")
public class LoginAction extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String code = req.getParameter("code");
		String scode = (String) session.getAttribute("scode");
		if(code.equals(scode)&&name.endsWith("tom")&&"123".equals(password)){
			resp.sendRedirect("success.jsp");
		}else{
			resp.sendRedirect("error.jsp");
		}
	}
	

}
