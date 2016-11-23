package com.hanbit.ex01;

public class StringExercise {

	public static void main(String[] args) {
		
		// 1. 입력받은 문자열의 길이를 구해서 출력하시오.
		String name = "한빛";
		int lengthOfName = getLengthOfString(name); 
		System.out.println(name + " : " + lengthOfName);
		
		// 2. 입력받은 문자열의 길이가 10개 이상이면
		//    "길이가 너무 길어요" 를 출력하세요.
		boolean validLength = isShorterThan10("안녕하세요.");
		if (!validLength) {
			System.out.println("길이가 너무 길어요");
		}
	}

	static int getLengthOfString(String str) {

		return str.length();
	}
	
}
