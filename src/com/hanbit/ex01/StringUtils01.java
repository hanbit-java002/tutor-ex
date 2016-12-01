package com.hanbit.ex01;

public class StringUtils01 {

	/*
	 * 함수명: trim
	 * 매개변수: String str
	 * 리턴타입: String
	 * 설명: 입력받은 문자열의 앞뒤 공백을 제거하고 반환합니다.
	 * 예1: trim("   abc   ") -> "abc"
	 * 예2: trim("a b ") -> "a b"
	 * 예3: trim(null) -> null
	 */
	static String trim(final String str) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result = "";
		
		for (int i=0;i<chars.length;i++) {
			char ch = chars[i];
			
			if (result.length() == 0 && StringUtils.isWhitespace(ch)) {
				continue;
			}
			
			result += ch;
		}
		
		chars = result.toCharArray();
		result = "";
		
		for(int i=0;i<chars.length;i++) {
			char ch = chars[chars.length - 1 - i];
			
			if (result.length() == 0 && StringUtils.isWhitespace(ch)) {
				continue;
			}
			
			result = ch + result;
		}
		
		return result;
	}
	
	static String rightTrim(final String str) {
		
		return null;
	}
	
	static String leftTrim(final String str) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result = "";
		
		for (int i=0;i<chars.length;i++) {
			if (result.length() == 0 && StringUtils.isWhitespace(chars[i])) {
				continue;
			}
			
			result += chars[i];
		}
		
		return result;
	}
	
	static String removeWhitespace(final String str) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result = "";
		
		for (int i=0;i<chars.length;i++) {
			if (StringUtils.isWhitespace(chars[i])) {
				continue;
			}
			
			result += chars[i];
		}
		
		return result;
	}
	
}
