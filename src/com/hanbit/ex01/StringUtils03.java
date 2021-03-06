package com.hanbit.ex01;

public class StringUtils03 {

	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다.
	 * 
	 * 예1: split("hello, world", ',') -> ["hello", " world"]
	 * 예2: split("5,4,3,2,1", ',') -> ["5", "4", "3", "2", "1"]
	 * 예3: split("이상윤|조영욱|||", '|') -> ["이상윤", "조영욱", "", "", ""]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] split(String str, char separator) {
		if (str == null) {
			return null;
		}
		
		if (!StringChecker.hasChar(str, separator)) {
			return new String[] {str};
		}
		
		char[] chars = str.toCharArray();
		String[] result = new String[StringChecker.countChar(str, separator) + 1];
		
		int n = 0;
		result[n] = "";
		
		for (int i=0;i<chars.length;i++) {
			if (chars[i] == separator) {
				result[++n] = "";
				continue;
			}
			
			result[n] += chars[i];
		}
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 빈문자열을 제외합니다.
	 * 
	 * 예1: splitNotEmpty("hello, world", ',') -> ["hello", " world"]
	 * 예2: splitNotEmpty("5,4,3,2,1", ',') -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotEmpty("이상윤|조영욱|| |", '|') -> ["이상윤", "조영욱", " "]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] splitNotEmpty(String str, char separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isEmpty(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isEmpty(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 공백으로만 이루어진 문자열을 제외합니다.
	 * 
	 * 예1: splitNotBlank("hello, world", ',') -> ["hello", " world"]
	 * 예2: splitNotBlank("5,4,3,2,1", ',') -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotBlank("이상윤|조영욱|  |\t\r\n|", '|') -> ["이상윤", "조영욱"]
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	static String[] splitNotBlank(String str, char separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isBlank(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isBlank(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다.
	 * 
	 * 예1: split("hello, world", ",") -> ["hello", " world"]
	 * 예2: split("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: split("이상윤||조영욱|||", "||") -> ["이상윤", "조영욱", "|"]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] split(String str, String separator) {
		if (str == null) {
			return null;
		}
		
		if (!StringUtils00.contains(str, separator)) {
			return new String[] {str};
		}

		char[] chars = str.toCharArray();
		String[] result = new String[StringUtils00.countMatches(str, separator) + 1];
		
		int n = 0;
		result[n] = "";
		
		for (int i=0;i<chars.length;i++) {
			String candidate = "";
			
			for (int j=i;j<chars.length && j<i+separator.length();j++) {
				candidate += chars[j];
			}
			
			if (separator.equals(candidate)) {
				result[++n] = "";
				i += separator.length() - 1;
				continue;
			}
			
			result[n] += chars[i];
		}
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 빈문자열을 제외합니다.
	 * 
	 * 예1: splitNotEmpty("hello, world", ",") -> ["hello", " world"]
	 * 예2: splitNotEmpty("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotEmpty("이상윤|조영욱|| ||", "||") -> ["이상윤|조영욱", " "]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] splitNotEmpty(String str, String separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isEmpty(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isEmpty(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열을 반환합니다. 단, 빈문자열을 제외합니다.
	 * 
	 * 예1: splitNotBlank("hello, world", ",") -> ["hello", " world"]
	 * 예2: splitNotBlank("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotBlank("이상윤|조영욱|| ||", "||") -> ["이상윤|조영욱"]
	 * 
	 * @param str
	 * @param separator 구분자
	 * @return
	 */
	static String[] splitNotBlank(String str, String separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isBlank(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isBlank(split[i])) {
				continue;
			}
			
			result[n++] = split[i];
		}		
		
		return result;
	}
	
	
	/**
	 * 입력받은 문자열을 구분자를 기준으로 분리한 문자열의
	 * 배열 중 빈문자열을 제외하고, 빈문자열이 아닌 문자열의
	 * 앞뒤 공백도 제거한 문자열의 배열을 반환합니다.
	 * 
	 * 예1: splitNotBlankAndTrim("hello, world", ",") -> ["hello", "world"]
	 * 예2: splitNotBlankAndTrim("5,4,3,2,1", ",") -> ["5", "4", "3", "2", "1"]
	 * 예3: splitNotBlankAndTrim("이상윤|조영욱|| ||", "||") -> ["이상윤|조영욱"]
	 * 
	 * @param str
	 * @param separator
	 * @return
	 */
	static String[] splitNotBlankAndTrim(String str, String separator) {
		int count = 0;
		
		String[] split = split(str, separator);
		
		for (int i=0;i<split.length;i++) {
			if (!StringUtils.isBlank(split[i])) {
				count++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i=0, n=0;i<split.length;i++) {
			if (StringUtils.isBlank(split[i])) {
				continue;
			}
			
			result[n++] = StringUtils01.trim(split[i]);
		}		
		
		return result;
	}
	
	
	
	
	
	
	
}
