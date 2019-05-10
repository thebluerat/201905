package com.java0430;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main") // http://hocalhost:8080/201905/Main
public class Main extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		response.setContentType("text/html; charset=UTF-8");//브라우저 화면에서 보이게
		response.setCharacterEncoding("UTF-8");//한글 인코딩
		
		response.getWriter().print("안녕하세요"); //출력
	}	


}
