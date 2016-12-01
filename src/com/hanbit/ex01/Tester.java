package com.hanbit.ex01;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("[" + StringUtils01.trim("   a  b  c   ") + "]");
		System.out.println("[" + StringUtils01.leftTrim("   a  b  c   ") + "]");
		System.out.println("[" + StringUtils01.rightTrim("   a  b  c   ") + "]");
		System.out.println("[" + StringUtils01.removeWhitespace("   a  b  c   ") + "]");
	}
	
}
