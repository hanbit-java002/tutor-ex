package com.hanbit.ex01;

public class Calculator {
	
	public static void main(String[] args) {
		
		int number1 = 10;
		int number2 = 6;
		
		// 주어진 변수 2개를 사용하여 작성한 각 함수를 호출하고
		// 결과를 출력하세요.
		System.out.println(sum(number1, number2));
		System.out.println(subtract(number1, number2));
		System.out.println(multiply(number1, number2));
		System.out.println(divide(number1, number2));
		System.out.println(remain(number1, number2));
		
		System.out.println("-----------------");
		
		System.out.println(sum(number1, number2));
		System.out.println("sum(number1, number2)");
		
		System.out.println("-----------------");
		
		System.out.println(sum(number1, sum(number2, number1)));
	}

	// sum(더하기), subtract(빼기), multiply(곱하기)
	// divide(나누기), remain(나머지) 함수를 만들고
	// 각 함수의 매개변수는 정수 2개씩 반환형은 정수
	
	static int sum(int x, int y) {
		
		return x + y;
	}
	
	static int subtract(int x, int y) {
		
		return x - y;
	}
	
	static int multiply(int x, int y) {
		
		return x * y;
	}
	
	static int divide(int x, int y) {
		
		return x / y;
	}
	
	static int remain(int x, int y) {
		
		return x % y;
	}
	
}
