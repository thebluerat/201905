package com.java0508;

public class Test implements Testinterface, Test1Interface {

	@Override //오버라이드 - 클래스나 인터페이스(추상이 들어 있기 때문에 강제성이 있다. 무조건 해야 함)를 상속받았을 때. 재구성
	public int add() {
		
		return 0;

	}

	
	public void print() {
		
	}
	
	@Override
	public void add(int a) {
		System.out.println(a);
	}

}
