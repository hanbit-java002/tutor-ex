package com.hanbit.ex01;

public class StringUtils {

	public static void main(String[] args) {
		// reverse 함수를 사용하여 다음 문자열을 뒤집어 출력하세요.
		String fruit = "banana";
		System.out.println(reverse(fruit));
		
		String str = null;
		System.out.println("isEmpty: " + isEmpty(str));
		
		System.out.println("isBlank: " + isBlank("\t"));
	}
	
	/*
	 * 함수명: reverse
	 * 매개변수: String str
	 * 리턴타입: String
	 * 설명: 입력받은 문자열을 뒤집어 반환합니다.
	 *       단, 문자열이 null 이면 null을 반환합니다.
	 * 예1: reverse("hello") -> "olleh"
	 * 예2: reverse(null) -> null
	 * 예3: reverse("") -> ""
	 */
	static String reverse(String str) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		
		String reverseStr = "";
		
		for (int i=0;i<chars.length;i++) {
			reverseStr = chars[i] + reverseStr;
		}
		
		return reverseStr;
	}
	
	/*
	 * 함수명: isEmpty
	 * 매개변수: String str
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자열이 "" 이거나 null 이면 true,
	 *       아니면 false를 반환합니다.
	 */
	static boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * 함수명: isBlank
	 * 매개변수: String str
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자열이 null 이거나 공백이면 true,
	 *       아니면 false를 반환합니다.
	 * 예1: isBlank("") -> true
	 * 예2: isBlank("   ") -> true
	 * 예3: isBlank("  ab   ") -> false
	 */
	static boolean isBlank(String str) {
		// 문자열이 null 이면 true
		if (str == null) {
			return true;
		}
		
		// 문자열의 각 문자가 하나라도 공백이 아니면 false
		// 1. 문자열의 각 문자를 분리
		char[] chars = str.toCharArray();
		
		// 2. 각 문자를 하나씩 공백인지 비교
		for (int i=0;i<chars.length;i++) {
			if (!isWhitespace(chars[i])) {
				return false;
			}
		}
		
		// 위 조건에 충족되지 않으면 true		
		return true;
	}
	
	/*
	 * 함수명: isWhitespace
	 * 매개변수: char ch
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자가 공백이면 true, 아니면 false를 반환합니다.
	 */
	static boolean isWhitespace(char ch) {
		
		return ch == 32 || ch == 9 || ch == 13 || ch == 10;
	}
	
	/*
	 * 함수명: isDigit
	 * 매개변수: char ch
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자가 0-9 이면 true, 아니면 false를 반환합니다.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
