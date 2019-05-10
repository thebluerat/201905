<%@page import="com.java0508.Test1Interface"%>
<%@ page import= "com.java0508.Test" %>
<%@ page import= "com.java0508.Testinterface"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
	Testinterface ti;
	// ti = new Testinterface(); //인터페이스는 생성자가 없다
	ti = new Test();
	int result = ti.add(); // 돌아오는 값이 정수형이다
	
	//ti. 해도 print가 나오지 않는다. 인터페이스가 가지고 있는 것만 사용할 수 있다 
	//ti.print();는 인터페이스에 없기 때문에 사용 불가
	
	Test1Interface t1i = new Test();
	t1i.add(10);
	
%>
<%= result %> <!-- 변수값 출력 -->