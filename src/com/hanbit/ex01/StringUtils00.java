package com.hanbit.ex01;

public class StringUtils00 {

	public static void main(String[] args) {
		System.out.println(compare("백미리", "백수현"));
		
		System.out.println(switchCase('!'));
	}
	
	/*
	 * 함수명: compare
	 * 매개변수1: String left
	 * 매개변수2: String right
	 * 리턴타입: int
	 * 설명: 두개의 문자열을 입력받아 왼쪽이 크면 1,
	 *       오른쪽이 크면 -1, 같으면 0을 반환합니다.
	 * 예1: compare("11", "2") -> -1
	 * 예2: compare("11111111111111", "2") -> -1
	 * 예3: compare("abc", "abcd") -> -1
	 * 예4: compare("ab", "ABC") -> -1
	 */
	static int compare(String left, String right) {
		if (left == null && right == null) {
			return 0;
		}
		else if (left != null && right == null) {
			return 1;
		}
		else if (left == null && right != null) {
			return -1;
		}

		char[] leftChars = left.toCharArray();
		char[] rightChars = right.toCharArray();
		
		for (int i=0;i<leftChars.length;i++) {
			if (i >= rightChars.length) {
				return 1;
			}
			
			if (leftChars[i] > rightChars[i]) {
				return 1;
			}
			else if (leftChars[i] < rightChars[i]) {
				return -1;
			}
		}
		
		if (leftChars.length < rightChars.length) {
			return -1;
		}
		
		return 0;
	}
	
	/*
	 * 함수명: switchCase
	 * 매개변수: char ch
	 * 리턴타입: char
	 * 설명: 소문자를 입력받으면 대문자로, 대문자를 입력받으면 소문자로 반환합니다.
	 * 		 단, 영문자가 아니면 그대로 반환합니다.
	 * 예1: switchCase('a') -> 'A'
	 * 예2: switchCase('D') -> 'd'
	 * 예3: switchCase('!') -> '!'
	 */
	static char switchCase(char ch) {
		int gabOfCase = 'a' - 'A';
		
		if (ch >= 'A' && ch <= 'Z') {
			return (char) (ch + gabOfCase);
		}
		else if (ch >= 'a' && ch <= 'z') {
			return (char) (ch - gabOfCase);
		}
		
		return ch;
	}
	
	/*
	 * 함수명: toLowerCase
	 * 매개변수: char ch
	 * 리턴타입: char
	 * 설명: 입력받은 영문 대문자를 소문자로 반환합니다.
	 *       단, 영문 대문자가 아니면 그대로 반환합니다.
	 * 예1: toLowerCase('A') -> 'a'
	 * 예2: toLowerCase('a') -> 'a'
	 */
	
	
	/*
	 * 함수명: toUpperCase
	 * 매개변수: char ch
	 * 리턴타입: char
	 * 설명: 입력받은 영문 소문자를 대문자로 반환합니다.
	 *       단, 영문 소문자가 아니면 그대로 반환합니다.
	 * 예1: toUpperCase('A') -> 'A'
	 * 예2: toUpperCase('a') -> 'A'
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
