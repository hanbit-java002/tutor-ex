package com.hanbit.ex01;

public class StringConcat {
	
	public static void main(String[] args) {
		String firstName = "이버";
		String lastName = "네";
		
		// concat 함수를 사용하여 "네이버"를 출력하세요.
		System.out.println(concat(lastName, firstName));
	}

	// 함수명이 concat 이고 두개의 문자열을 받아
	// 두 문자열을 합친 문자열을 반환하는 함수를 작성하세요.
	static String concat(String str1, String str2) {
		
		return str1 + str2;
	}
	
	/*
	 * 함수명: concat
	 * 매개변수: String[] strings
	 * 리턴타입: String
	 * 설명: 입력받은 문자열 배열의 모든 문자열을 합쳐서 반환합니다.
	 * 예: concat(new String[] {"이", "상", "윤"}) -> "이상윤"
	 */
	
	
	
	
	
	
	
	
}
