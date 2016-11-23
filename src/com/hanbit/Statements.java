package com.hanbit;

public class Statements {

	public static void main(String[] args) {
		
		int number = 4; // 선언문 (Declaration statement)
		number = 7; // 할당문 (Assignment statement)
		number = plus(400, 9); // 호출문 (Invocation statement)
		
		// Control flow statements (제어 흐름 문장들)
		// 조건문 (Conditional statements)
		// if
		String oddOrEven1 = number % 2 != 0 ? "홀수" : "짝수";
		System.out.println(oddOrEven1);
		
		number = -3;
		
		if (number % 3 == 0 && number > 100 || number > -11) {
			System.out.println("통과");
		}
		
		// 해당월이 몇분기인지 출력하시오.
		int month = 5;
		
		// switch
		switch (month) {
			case 1:
			case 2:
			case 3:
				System.out.println("1/4분기");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("2/4분기");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("3/4분기");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("4/4분기");
				break;
		}
		
		
		// 반복문 (Looping statements)
	}
	
	static int plus(int x, int y) {
		return x + y;
	}
	
}
