package com.java0507;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main9")
public class Main9 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
		String html = "";
		html += "<!DOCTYPE html>";
		html += "<html>";
		html += "<head>";
		html += "<meta charset='UTF-8'>";
		html += "<title>Insert title here</title>";
		html += "</head>";
		for(int i = 0; i < 10; i++ ) {
		html += "바보";
		}
		html += "</body>";
		html += "</html>";
		System.out.println(html);
		response.getWriter().print(html);
		
	}
		
}
