package com.hanbit.ex01;

public class StringChecker {

	/*
	 * 함수명: hasNumber
	 * 매개변수1: String str
	 * 리턴타입: boolean
	 * 설명: 문자열을 입력받아 숫자를 포함하고 있는지 여부를 반환합니다.
	 * 힌트1: char[] chars = str.toCharArray();
	 * 힌트2: if (chars[i] == '3') { ... }
	 * 예1: hasNumber("hello123") -> true
	 * 예2: hasNumber("박재홍") -> false
	 * 예3: hasNumber("A1") -> true
	 */
	static boolean hasNumber(String str) {
		char[] chars = str.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			boolean isNumber = chars[i] == '0' || chars[i] == '1' || chars[i] == '2'
					|| chars[i] == '3' || chars[i] == '4' || chars[i] == '5' 
					|| chars[i] == '6' || chars[i] == '7' || chars[i] == '8' 
					|| chars[i] == '9'; 
			
			if (isNumber) {
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * 함수명: hasChar
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: boolean
	 * 설명: 문자열과 문자 1개를 입력받아 문자열이 해당 문자를 포함하고
	 *       있는지 여부를 반환합니다.
	 * 예1: hasChar("hello123", 'l') -> true
	 * 예2: hasNumber("박재홍", 'h') -> false
	 */
	static boolean hasChar(String str, char ch) {
		char[] chars = str.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			if (chars[i] == ch) {
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * 함수명: hasY
	 * 매개변수: String str
	 * 리턴타입: boolean
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
