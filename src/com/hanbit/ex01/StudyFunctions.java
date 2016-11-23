package com.hanbit.ex01;

public class StudyFunctions {

	public static void main(String[] args) {
		
		// 1. 변수로 받은 문자열을 출력하는 함수를 작성하세요.
		printString("Hello");

		// 2. 변수로 받은 월에 따라 영문 월명을 출력하세요.
		//   ex: month = 1 -> January
		//   ex: month = 2 -> Febrary
		int month = 1;
		printMonthName(month);
	}

	static void printString(String string) {
		System.out.println(string);
	}
	
}
