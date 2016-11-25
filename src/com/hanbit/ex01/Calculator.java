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
	
	// 함수명: calculateMore
	// 매개변수1: int x
	// 매개변수2: int y
	// 매개변수3: String operator1 ("+", "-", "*", "/", "%")
	// 매개변수4: String operator2
	// 매개변수5: String operator3
	// 리턴타입: int
	// 설명: 두개의 정수를 첫번째 연산자와 세번째 연산자로 계산한 후
	//       각 결과를 두번째 연산자로 계산하여 결과를 반환합니다.
	// 예: calculateMore(3, 4, "*", "+", "-") -> 11
	static int calculateMore(int x, int y,
			String operator1, String operator2, String operator3) {
		
		int result1 = calculate(x, y, operator1);
		int result2 = calculate(x, y, operator3);
		
		return calculate(result1, result2, operator2);
	}

	// 함수명: calculateMore
	// 매개변수1: int x
	// 매개변수2: int y
	// 매개변수3: String[] operators ("+", "-", "*", "/", "%")
	// 리턴타입: int
	// 설명: 두개의 정수를 첫번째 연산자와 세번째 연산자로 계산한 후
	//       각 결과를 두번째 연산자로 계산하여 결과를 반환합니다.
	// 예: calculateMore(3, 4, new String[] {"*", "+", "-"}) -> 11
	static int calculateMore(int x, int y, String[] operators) {
		
		return calculateMore(x, y, operators[0], operators[1], operators[2]);
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
