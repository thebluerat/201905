package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Main4")
public class Main4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		int re1;	
		float re2;
		
		
		계산기 cc = new 계산기();
		

		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");

		switch(b) {
		case "+" :
			re1=cc.덧셈(Integer.parseInt(a), Integer.parseInt(c));
			response.getWriter().print(a + b + c + "=" + re1);
			break;
		case "-" :
			re1=cc.뺄셈(Integer.parseInt(a), Integer.parseInt(c));
			response.getWriter().print(a + b + c + "=" + re1);
			break;
		case "*" :
			re2=cc.곱셈(Integer.parseInt(a), Integer.parseInt(c));
			response.getWriter().print(a + b + c + "=" + re2);
			break;
		case "/" :
			re2=cc.나눗셈(Integer.parseInt(a), Integer.parseInt(c));
			response.getWriter().print(a + b + c + "=" + re2);
			break;
		}
		
		
		response.getWriter().print("<br><a href= 'http://localhost:8080/201905/'>처음</a>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
