package com.wcy.action;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wcy.util.ImgUtil;
@WebServlet("/code.do")
public class CodeAction extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OutputStream os = resp.getOutputStream();
		HttpSession session = req.getSession();
		try {
			String scode = ImgUtil.randomStr();
			session.setAttribute("scode", scode);
			ImgUtil.writeCodeToStream(scode, os);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
