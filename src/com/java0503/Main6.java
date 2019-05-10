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

@WebServlet("/Main6")
public class Main6 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		사용자 유저 =new 사용자();
//		유저.나이=1;
//		유저.키=3;
//		유저.몸무게=4;
//		유저.이름 = "구디";
//		유저.set이름("구디");
//		String 이름 = 유저.get이름();
		
//		사용자 구디 = new 사용자("구디",1,2,3); //작성하기 편하라고 기본생성자 작성함
//		사용자 가산 = new 사용자("가산", 10, 20, 30);
//		
//		if(구디.get나이()>가산.get나이()) {
//			System.out.println("구디");
//		}else if(구디.get나이() < 가산.get나이()){
//			System.out.println("가산");
//		}else {
//			System.out.println("같다");
//		}
		
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("이름", "구디");
		resultMap.put("나이", "1");
		resultMap.put("키", "2");
		resultMap.put("몸무게", "3");
		resultMap.put("학교", "구디아카데미");
		
		String 이름 = resultMap.get("이름").toString();
		System.out.println(이름);
		
		List<사용자> 사용자목록 = new ArrayList<사용자>(); //배열
		사용자목록.add(new 사용자("구디",1,2,3));//0 인덱스
		사용자목록.add(new 사용자("가산", 10, 20, 30));//1 인덱스위치에 객체 담기
		
//		if(사용자목록.get(0).get나이() > 사용자목록.get(1).get나이()) {
//			System.out.println(사용자목록.get(0).get이름());
//		}else {
//			System.out.println(사용자목록.get(1).get이름());
//		}
		
		사용자 구디 = 사용자목록.get(0);
		사용자 가산 = 사용자목록.get(1);
		
		if(구디.get나이()>가산.get나이()) {
			System.out.println("구디");
		}else if(구디.get나이() < 가산.get나이()){
			System.out.println("가산");
		}else {
			System.out.println("같다");
		}
		
		List 정수형리스트 = new ArrayList();
		정수형리스트.add(1);
		정수형리스트.add("2"); //정의하지 않으면 다른 형 가능 
		
		for(int i = 0; i< 정수형리스트.size(); i++) {
			System.out.println(정수형리스트.get(i));
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
