package com.hanbit.ex01;

public class NumberUtils {

	public static void main(String[] args) {
		int x = 8;
		int y = 10;
		
		// compare를 사용하여 결과값을 출력하세요.
		// 출력: compare(x, y)의 결과는 ? 입니다.
		String result = "compare(" + x + ", " + y + ")의 결과는 "; 
		result += compare(x, y) + " 입니다.";
		System.out.println(result);
		
		// isNumber를 사용하여 다음 문자열이 숫자인지 출력하세요.
		// 출력: ? 은 숫자입니다. / ? 은 숫자가 아닙니다.
		String str = "56";
		
	}
	
	/*
	 * 함수명: compare
	 * 매개변수: int left
	 * 매개변수: int right
	 * 리턴타입: int
	 * 설명: 두개의 정수를 입력받아 왼쪽정수가 크면 1
	 *       오른쪽 정수가 크면 -1, 같으면 0을 반환합니다.
	 * 예1: compare(1, 4) -> -1
	 * 예2: compare(50, 4) -> 1
	 * 예3: compare(7, 7) -> 0
	 */
	static int compare(int left, int right) {
		if (left > right) {
			return 1;
		}
		else if (left < right) {
			return -1;
		}
		
		return 0;
	}
	
	/*
	 * 함수명: isNumber
	 * 매개변수: String str
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자열이 숫자 형태인지 여부를 반환합니다.
	 * 예1: isNumber("123") -> true
	 * 예2: isNumber("0.3") -> true
	 * 예3: isNumber("4시") -> false
	 */
	
	
	
	
	
	
	
	
	
	
}
