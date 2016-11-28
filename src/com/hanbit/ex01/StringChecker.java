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
	 * 설명: 문자열을 입력받아 'Y' 또는 'y'를 포함하고 있는지 여부를 반환합니다.
	 * 예1: hasY("Yes") -> true
	 * 예1: hasY("merry") -> true
	 * 예3: hasY("no") -> false
	 */
	static boolean hasY(String str) {
		char[] chars = str.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			boolean isY = chars[i] == 'Y' || chars[i] == 'y'; 
			
			if (isY) {
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * 함수명: countChar
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: int
	 * 설명: 문자열과 문자 1개를 입력받아 문자열에 해당 문자가
	 *       몇개 포함되어있는지를 반환합니다.
	 * 예1: countChar("merry", 'r') -> 2
	 * 예2: countChar("merry", 'e') -> 1
	 * 예3: countChar("merry", 'Y') -> 0
	 */
	static int countChar(String str, char ch) {
		char[] chars = str.toCharArray();
		int count = 0;
		
		for (int i=0;i<chars.length;i++) {
			if (chars[i] == ch) {
				count++;
			}
		}
		
		return count;
	}
	
	/*
	 * 함수명: indexOf
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: int
	 * 설명: 문자열과 문자 1개를 입력받아 해당 문자의 위치를 반환합니다.
	 *       단, 해당 문자가 없으면 -1 을 반환합니다.
	 * 예1: indexOf("hello", 'e') -> 1
	 * 예2: indexOf("christmas", 'd') -> -1
	 */
	static int indexOf(String str, char ch) {
		char[] chars = str.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			if (chars[i] == ch) {
				return i;
			}
		}
		
		return -1;
	}
	
	/*
	 * 함수명: charAt
	 * 매개변수1: String str
	 * 매개변수2: int index
	 * 리턴타입 char
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
