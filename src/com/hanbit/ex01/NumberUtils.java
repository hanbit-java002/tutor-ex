package com.hanbit.ex01;

public class NumberUtils {

	public static void main(String[] args) {
		int x = 8;
		int y = 10;
		
		// compare 함수를 사용하여 결과값을 출력하세요.
		// 출력: compare(x, y)의 결과는 ? 입니다.
		String result = "compare(" + x + ", " + y + ")의 결과는 "; 
		result += compare(x, y) + " 입니다.";
		System.out.println(result);
		
		// isNumber 함수를 사용하여 다음 문자열이 숫자인지 출력하세요.
		// 출력: ? 은 숫자입니다. / ? 은 숫자가 아닙니다.
		String str = "-56.0";
		
		if (isNumber(str)) {
			System.out.println(str + " 은 숫자입니다.");
		}
		else {
			System.out.println(str + " 은 숫자가 아닙니다.");
		}
		
		// max 함수를 사용하여 가장 큰 값을 구하시오.
		// 출력: 가장 큰 수는 ? 입니다.
		int[] numbers = new int[] {100, 39, 55, 193, 98};
		
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
	static boolean isNumber(String str) {
		char[] chars = str.toCharArray();
		boolean negative = false;
		boolean hasPoint = false;
		
		for (int i=0;i<chars.length;i++) {
			char ch = chars[i];
			
			if (!(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5'
					|| ch == '6' || ch == '7' || ch == '8' || ch == '9')) {
				if (i == 0 && ch == '-') {
					negative = true;
					continue;
				}
				
				int pointMinPosition = 0;
				
				if (negative) {
					pointMinPosition = 1;
				}
				
				if (!hasPoint && i > pointMinPosition && ch == '.') {
					if (i == chars.length - 1) {
						return false;
					}
					
					hasPoint = true;
					continue;
				}
				
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * 함수명: max
	 * 매개변수: int[] numbers
	 * 리턴타입: int
	 * 설명: 입력받은 정수 배열의 값 중 가장 큰 값을 반환합니다.
	 * 힌트: int max = Integer.MIN_VALUE;
	 * 예1: max(new int[] {7, 10, 3}) -> 10
	 * 예2: max(new int[] {7, 10, 3, 99}) -> 99
	 * 예3: max(new int[] {107, 10, 3, 99, 100}) -> 107
	 */
	static int max(int[] numbers) {
		int max = Integer.MIN_VALUE;
		
		for (int i=0;i<numbers.length;i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		return max;
	}
	
	/*
	 * 함수명: min
	 * 매개변수: int[] numbers
	 * 리턴타입: int
	 * 설명: 입력받은 정수 배열의 값 중 가장 작은 값을 반환합니다.
	 * 힌트: int min = Integer.MAX_VALUE;
	 * 예1: min(new int[] {7, 10, 3}) -> 3
	 * 예2: min(new int[] {7, 10, 3, 99}) -> 3
	 * 예3: min(new int[] {107, -10, 3, 99, 100}) -> -10
	 */
	
	
	
	
	
	
	
	
	
	
	
}
