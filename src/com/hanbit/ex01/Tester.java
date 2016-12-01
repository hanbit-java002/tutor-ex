package com.hanbit.ex01;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		
		long time = System.nanoTime();
		System.out.println("[" + StringUtils01.trim("   a  b  c   ") + "]");
		System.out.println((System.nanoTime() - time) + "ns");
		
		time = System.nanoTime(); 
		System.out.println("[" + StringUtils01.trimFast("   a  b  c   ") + "]");
		System.out.println((System.nanoTime() - time) + "ns");
		
		time = System.nanoTime(); 
		System.out.println("[" + "   a  b  c   ".trim() + "]");
		System.out.println((System.nanoTime() - time) + "ns");
		
		System.out.println("[" + StringUtils01.leftTrim("   a  b  c   ") + "]");
		System.out.println("[" + StringUtils01.rightTrim("   a  b  c   ") + "]");
		System.out.println("[" + StringUtils01.removeWhitespace("   a  b  c   ") + "]");
		
		time = System.nanoTime();
		System.out.println(StringUtils01.leftPad("11", 4, '0'));
		System.out.println((System.nanoTime() - time) + "ns");
		
		time = System.nanoTime();
		System.out.println(StringUtils01.rightPad("11", 4, '0'));
		System.out.println((System.nanoTime() - time) + "ns");

		time = System.nanoTime();
		System.out.println(StringUtils01.repeat(4, '0'));
		System.out.println((System.nanoTime() - time) + "ns");
	}
	
}
