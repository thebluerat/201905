package com.java0510;

import java.util.Scanner;

public class Study2 {
	
/*	public void Study2_Method() 
	{
		int num = 1;
		
		while(num<=10)
		{
			
			System.out.println(num + "번 학생의 시험 점수를 입력하세요: ");
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();
			if(score>=90) {
				System.out.println(num + "번 학생의 시험 결과는: A입니다.");
			}else if(score>=80) {
				System.out.println(num + "번 학생의 시험 결과는: B입니다.");
			}else if(score>=70) {
				System.out.println(num + "번 학생의 시험 결과는: C입니다.");
			}else if(score>=60) {
				System.out.println(num + "번 학생의 시험 결과는: D입니다.");
			}else {
				System.out.println(num + "번 학생의 시험 결과는: F입니다.");
			}
			num++;
		}
	}
	*/
	
	/*public void Study3_Method()
	{
		int number = 1;
		Scanner scan = new Scanner(System.in);
				System.out.println("첫 번째 숫자는: ");
				int a = scan.nextInt();
				System.out.println("두 번째 숫자는: ");
				int b = scan.nextInt();
				System.out.println("세 번째 숫자는: ");
				int c = scan.nextInt();
		
		if(a>b){
			if(a>c) {
				if(b>c) {
					System.out.println("abc");
				}else if(b<c) {
					System.out.println("acb");
				}
			}else if(c>b) {
				System.out.println("cab");
			}
		}else if(b>a) {
			if(b>c) {
				if(c>a) {
					System.out.println("bca");
				}else if(a>c) {
					System.out.println("bac");
				}
			}else if(c>b) {
				System.out.println("cba");
			}
		}
	
	
	/*public void if_Struct() {
		int a = 10;
		int b = 7;
		int c = 5;

		//1 . if - else
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		}else {
			System.out.println("b가 a보다 큽니다.");
		}
			
		
		//2. if - else if - else
		if( a > b ) {
			
		}else if( a > b ) {
			
		}else {
			
		}
		
		// 3. else 생략 가능합니다.
		if( a > b) {
			
		}
			
			
	}*/
	
	
	/*public void Study4_Method() {
		System.out.println("공을 던지시오");
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		
		if(d>=50 && d<=70 || d%6==0) {
			System.out.println("win");
		}else{
			System.out.println("lose");
		}
	}
	*/
	
	public void Study5_Method() {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		int h = 0;
		while(n<4) {
			System.out.println("터널의 높이를 입력하시오");
			h = scan.nextInt();
			n++;
			if(h<=170)
				break;
		}
		System.out.println("CRASH " + h);
	}
	
	
}


	

