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
		 *		static void print() {
		 *		
		 *		}
		 *
		 * }
		 */
		System.out.println(generateSourceCode("Hello, Java", new String[] {"print"}));
	}

	static String generateSourceCode(String string) {
		String code = "public class JavaCodeGenerator {\n\n";
		code += "\tpublic static void main(String[] args) {\n";
		code += "\t\tSystem.out.println(\"" + string + "\");\n";
		code += "\t}\n\n";
		code += "}";
		
		return code;
	}
	
}
