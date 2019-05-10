<%@page import="java.util.ArrayList" %>
<%@page import="com.java0503.사용자" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="http://localhost:8080/201905/Main10.jsp" method="get">
			<input type="text" name="이름" placeholder="이름을 입력하세요"><br>
			<input type="number" name="나이" placeholder="나이를 입력하세요"><br>
			<input type="number" name="키" placeholder="키를 입력하세요"><br>
			<input type="number" name="몸무게" placeholder="몸무게를 입력하세요"><br>
			<input type="submit" value="사용자 입력">

<%
	List<사용자> 사용자목록 = new ArrayList<사용자>();
	
	
	// 사용자 입력
	String 이름 = request.getParameter("이름");
	int 나이 = Integer.parseInt(request.getParameter("나이"));
	int 키 = Integer.parseInt(request.getParameter("키"));
	int 몸무게 = Integer.parseInt(request.getParameter("몸무게"));
	사용자목록.add(new 사용자(이름, 1, 2, 3));
	
	// 사용자 검색
	boolean check = true;
	for(int i = 0; i < 사용자목록.size(); i++){
		response.getWriter().print(사용자목록.get(i).get이름()+"<br>");
		
		if(사용자목록.get(i).get이름().equals(이름)) {
		
			response.getWriter().print("이름 : " + 사용자목록.get(i).get이름()+"<br>");
			response.getWriter().print("나이 : " + 사용자목록.get(i).get나이()+"<br>");
			response.getWriter().print("키 : " + 사용자목록.get(i).get키()+"<br>");
			response.getWriter().print("몸무게 : " + 사용자목록.get(i).get몸무게()+"<br>");
			check = false;
		}
	}
	if(check) {
		response.getWriter().print("검색한 이름 : " + 이름 + "은 사용자 목록에 없습니다.");
	}
%>


			<input type="text" name="이름" placeholder="이름을 입력하세요"><br>
			<input type="submit" value="이름 검색">
		</form>

</body>
</html>