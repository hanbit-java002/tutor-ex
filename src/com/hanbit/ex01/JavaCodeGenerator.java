package com.hanbit.ex01;

public class JavaCodeGenerator {

	public static void main(String[] args) {
	
		/*
		 * 다음과 같이 소스코드를 생성하여 출력하시오.
		 * 
		 * public class JavaCodeGenerator {
		 * 
		 * 		public static void main(String[] args) {
		 * 			System.out.println("Hello, Java");
		 *		}
		 *
		 * }
		 */
		System.out.println(generateSourceCode("Hello, Java"));
	}
	
}
