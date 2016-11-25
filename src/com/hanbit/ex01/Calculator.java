package com.hanbit.ex01;

public class Calculator {
	
	public static void main(String[] args) {
		
	}
	
	// 함수명: calculate
	// 매개변수1: int x
	// 매개변수2: int y
	// 매개변수3: String operator ("+", "-", "*", "/", "%")
	// 리턴타입: int
	// 예: calculate(3, 4, "*") -> 12
	static int calculate(int x, int y, String operator) {
		if ("+".equals(operator)) {
			return sum(x, y);
		}
		else if ("-".equals(operator)) {
			return subtract(x, y);
		}
		else if ("*".equals(operator)) {
			return multiply(x, y);
		}
		else if ("/".equals(operator)) {
			return divide(x, y);
		}
		else if ("%".equals(operator)) {
			return remain(x, y);
		}
		
		return 0;
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
