package com.hanbit.ex01;

public class StringUtils02 {

	/**
	 * 주어진 문자열에서 시작인덱스와 끝인덱스 사이의 문자열을 반환합니다.
	 * 
	 * 예1: substring("hello", 1, 4) -> "ell"
	 * 예2: substring("hello", 1, 10) -> "ello"
	 * 예3: substring("hello", 5, 9) -> ""
	 * 예4: substring("hello", -1, 4) -> null
	 * 
	 * @param str
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	static String substring(String str, int beginIndex, int endIndex) {
		if (str == null || beginIndex < 0 || endIndex < 0) {
			return null;
		}
		
		if (beginIndex >= str.length() || beginIndex >= endIndex) {
			return "";
		}
		
		endIndex = endIndex > str.length() ? str.length() : endIndex; 
		
		char[] chars = str.toCharArray();
		String result = "";
		
		for (int i=beginIndex;i<endIndex;i++) {
			result += chars[i];
		}
		
		return result;
	}
	
	/**
	 * 주어진 문자열에서 시작인덱스부터의 문자열을 반환합니다.
	 * 
	 * 예1: substring("hello", 1) -> "ello"
	 * 예2: substring("hello", 3) -> "lo"
	 * 예3: substring("hello", 5) -> ""
	 * 예4: substring("hello", -1) -> null
	 * 
	 * @param str
	 * @param beginIndex
	 * @return
	 */
	static String substring(String str, int beginIndex) {
		
		return str == null ? null : substring(str, beginIndex, str.length());
	}
	
	/**
	 * 입력받은 문자열에서 구분자로 받은 문자열 뒤의 문자열을 반환합니다.
	 * 
	 * 예1: substringAfter("hello world", "hello") -> " world"
	 * 예2: substringAfter("banana", "ba") -> "nana"
	 * 예3: substringAfter("banana", "B") -> ""
	 * 예4: substringAfter("banana", null) -> ""
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String substringAfter(String str, String separator) {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
