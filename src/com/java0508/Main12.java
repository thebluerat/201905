package com.java0508;

public class Main12 implements Main12Interface {


	
	@Override
	public boolean 학생추가(Student stu) {
		Util.학생목록.add(null);
		return false;
	}

	@Override
	public Student 학생검색(String name) {
		return null;
	}

	@Override
	public boolean 학생수정(Student stu) {
		return false;
	}

	@Override
	public boolean 학생삭제(Student stu) {
		return false;
	}

}
