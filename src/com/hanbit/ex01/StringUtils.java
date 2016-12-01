package com.hanbit.ex01;

public class StringUtils {

	public static void main(String[] args) {
		// reverse 함수를 사용하여 다음 문자열을 뒤집어 출력하세요.
		String fruit = "banana";
		System.out.println(reverse(fruit));
		
		String str = null;
		System.out.println("isEmpty: " + isEmpty(str));
		
		System.out.println("isBlank: " + isBlank("\t"));
		
		String text = new String(new char[] {(char) 65, (char) 66, (char) 67});
		System.out.println("text from chars: " + text);
		
		System.out.println("isAlphabet: " + isAlphabet((char) 65));
		
		System.out.println("isAlphaOrDigit: " +isAlphaOrDigit("Fighting_123"));
		
		System.out.println("removeChar: " + removeChar(null, '3'));
		
		System.out.println("removeStr(\"hello\", \"ll\") -> " + removeStr("hello", "ll"));
		System.out.println("removeStr(\"java\", \"av\") -> " + removeStr("java", "av"));
		System.out.println("removeStr(null, \"334\") -> " + removeStr(null, "334"));
		System.out.println("removeStr(\"hanbit\", \"hans\") -> " + removeStr("hanbit", "hans"));
		System.out.println("removeStr(\"banana\", \"na\") -> " + removeStr("banana", "na"));
		System.out.println("removeStr(\"banana\", null) -> " + removeStr("banana", null));
		System.out.println("removeStr(\"banana\", \"bananaa\") -> " + removeStr("banana", "bananaa"));
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
	static boolean isDigit(char ch) {
		
		return ch >= 48 && ch <= 57;
	}
	
	
	/*
	 * 함수명: isAlphabet
	 * 매개변수: char ch
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자가 a-z 또는 A-Z 이면 true, 아니면 false를 반환합니다.
	 */
	static boolean isAlphabet(char ch) {
		
		return (ch >= 97 && ch <=122) || (ch >= 65 && ch <= 90);
	}
	
	/*
	 * 함수명: isAlphaOrDigit
	 * 매개변수: String str
	 * 리턴타입: boolean
	 * 설명: 입력받은 문자열이 알파벳 또는 숫자로 구성되어있으면 true,
	 *       아니면 false를 반환합니다.
	 * 예1: isAlphaOrDigit("hello") -> true
	 * 예2: isAlphaOrDigit("1234") -> true
	 * 예3: isAlphaOrDigit("1st") -> true
	 * 예4: isAlphaOrDigit("Fighting!") -> false
	 */
	static boolean isAlphaOrDigit(String str) {
		char[] chars = str.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			if (!isAlphabet(chars[i]) && !isDigit(chars[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * 함수명: removeChar
	 * 매개변수1: String str
	 * 매개변수2: char ch
	 * 리턴타입: String
	 * 설명: 입력받은 문자열에서 주어진 문자를 삭제하고 반환합니다.
	 * 예1: removeChar("hello", 'l') -> "heo"
	 * 예2: removeChar("java", 'a') -> "jv"
	 * 예3: removeChar(null, '3') -> null
	 */
	static String removeChar(String str, char ch) {
		if (str == null) {
			return null;
		}
		
		char[] chars = str.toCharArray();
		String result = "";
		
		for (int i=0;i<chars.length;i++) {
			if (chars[i] == ch) {
				continue;
			}
			
			result += chars[i];
		}
		
		return result;
	}
	
	/*
	 * 함수명: removeStr
	 * 매개변수1: String str
	 * 매개변수2: String rmStr
	 * 리턴타입: String
	 * 설명: 입력받은 문자열에서 주어진 문자열을 삭제하고 반환합니다.
	 * 예1: removeStr("hello", "ll") -> "heo"
	 * 예2: removeStr("java", "av") -> "ja"
	 * 예3: removeStr(null, "334") -> null
	 * 예4: removeStr("hanbit", "hans") -> "hanbit"
	 * 예5: removeStr("banana", "na") -> "ba"
	 */
	static String removeStr(String str, String rmStr) {
		if (str == null) {
			return null;
		}

		if (rmStr == null || "".equals(rmStr) || str.length() < rmStr.length()) {
			return str;
		}
		
		String result = "";
		
		char[] chars = str.toCharArray();
		char[] rmChars = rmStr.toCharArray();
		
		for (int i=0;i<chars.length;i++) {
			boolean match = StringUtils00.isMatch(chars, rmChars, i);
			
			if (match) {
				i += rmChars.length - 1;
			}
			else {
				result += chars[i];
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
