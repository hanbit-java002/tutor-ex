package com.hanbit;

import java.math.BigDecimal;

public class Person {

	public static void main(String[] args) {
		int num1 = 547;
		int num2 = 715;
		int sum = plus(num1, num2);
		
		System.out.println(sum);
		System.out.println(minus(num1, num2));
		System.out.println(multiply(num1, num2));
		System.out.println(divide(num1, num2));
	}
	
	/* 이 함수는 매게변수 x 와 y 를 받습니다. */
	static boolean isLesserThanOrEven(int x, /* 비교값 */ int y) {
		return x <= y; // lte
	}

	static boolean isGreaterThanOrEven(int x, int y) {
		return x >= y; // gte
	}

	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
	
	static float divide(int x, int y) {
		return new BigDecimal(String.valueOf(x))
				.divide(new BigDecimal(String.valueOf(y)), 5, BigDecimal.ROUND_CEILING).floatValue();
	}
	
}
