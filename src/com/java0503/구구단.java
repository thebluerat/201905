package com.java0503;

public class 구구단 {
	String a= "";
	public String lv1() {
		/*****************************
		 * 1난이도 (한행에 하나씩)
		 * 1단 > 2단 (순차적으로 출력)
		 *****************************/
		
		for(int y = 1; y <= 9; y++) {
//			System.out.println(y + " 단");
			a = a + y + " 단 <br>";
			for(int x = 1; x <= 9; x++) {
//				System.out.println(y + " * " + x + " = " + (y * x));
				a = a + y + " * " + x + " = " + (y * x)+"<br>";
			}
//			System.out.println();
			a = a + "<br>";
		}
		
		return a;
	}
	
	public String lv2() {
		/*****************************
		 * 2난이도 (한행에 3단씩)
		 * 1단 2단 3단 > 4단 5단 6단 > 7단 8단 9단
		 *****************************/
		for(int y = 1; y <= 9; y = y + 3) {
//			System.out.print(y + " 단\t\t");
//			System.out.print((y + 1) + " 단\t\t");
//			System.out.print((y + 2) + " 단\t\t");
//			System.out.println();
			a = a + y + " 단";
			a = a + (y + 1) + " 단";
			a = a + (y + 2) + " 단";
			a = a + "<br>";
			
			for(int x = 1; x <= 9; x++) {
//				System.out.print(y + " * " + x + " = " + (y * x) + "\t");
//				System.out.print((y + 1) + " * " + x + " = " + ((y + 1) * x) + "\t");
//				System.out.print((y + 2) + " * " + x + " = " + ((y + 2) * x) + "\t");
//				System.out.println();
				a=a+y + " * " + x + " = " + (y * x);
				a=a+(y + 1) + " * " + x + " = " + ((y + 1) * x);
				a=a+(y + 2) + " * " + x + " = " + ((y + 2) * x);
				a=a+"<br>";
			}
			//System.out.println();
			a=a+"<br>";
		}
		return a;
	}

	public void lv3() {
		/*****************************
		 * 3난이도 (한행에 1,4,7 > 2,5,8 > 3,6,9)
		 * 1단 4단 7단 > 2단 5단 8단 > 3단 6단 9단
		 *****************************/
		for(int y = 1; y <= 3; y++) {
			System.out.print(y + " 단\t\t");
			System.out.print((y + 3) + " 단\t\t");
			System.out.print((y + 6) + " 단\t\t");
			System.out.println();
			for(int x = 1; x <= 9; x++) {
				System.out.print(y + " * " + x + " = " + (y * x) + "\t");
				System.out.print((y + 3) + " * " + x + " = " + ((y + 3) * x) + "\t");
				System.out.print((y + 6) + " * " + x + " = " + ((y + 6) * x) + "\t");
				System.out.println();
			}
			System.out.println();
		}
	}
}
