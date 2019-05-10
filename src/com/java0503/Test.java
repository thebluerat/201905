package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class Test extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("이름", "구디");
//		
//		String a= map.get("이름").toString();
//		System.out.println(a);
//		
//		List<사용자> 목록 = new ArrayList<사용자>();//배열
//		목록.add(new 사용자("가", 1, 2, 3));
//		
//		사용자 가 = 목록.get(0);
		
//		List<사용자> 목록 = new ArrayList<사용자>();
//		목록.add(new 사용자("나",1,2,3));
//		목록.add(new 사용자("다",4,5,6));
//		
//		사용자 나 = 목록.get(0);
//		사용자 다 = 목록.get(1);
//		
//		HashMap<String, Object> 맵 = new HashMap<String, Object>();
//		맵.put("이름", "양");
//		맵.put("나이", 15);
//		
//		String 이름 = 맵.get("이름").toString();
//		String 나이 = 맵.get("나이").toString();
//		System.out.println(나이);
//		
//		사용자 라 = new 사용자("라",1,3,5); //기본생성자
		
//		String a=request.getParameter("a");
//		int age=Integer.parseInt(a);
//		
//		사용자2 유저 = new 사용자2();
//		유저.나이=age;
//		response.setContentType("text/html; charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		response.getWriter().print(유저.get나이());
		
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("성별", "여");
//		
//		String 성별 = map.get("성별").toString();
		
		List<사용자2> 표 = new ArrayList<사용자2>();
		표.add(new 사용자2("dkdk", 30));
		표.add(new 사용자2("AA", 40));
		사용자2 dkdk = 표.get(0);
		사용자2 AA = 표.get(1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
