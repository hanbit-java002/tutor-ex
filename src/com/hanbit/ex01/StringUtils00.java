package com.hanbit.ex01;

public class StringUtils00 {

	public static void main(String[] args) {
		System.out.println(compare("백미리", "백수현"));
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
}
