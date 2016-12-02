package com.hanbit.ex01;

public class Tester {

	public static void main(String[] args) {
		
		long time = System.nanoTime();
		printArray(StringUtils03.split("|||이 상 윤|조영욱|  ||", '|'));
		System.out.println("----------------");
		printArray(StringUtils03.split("이상윤||조영욱||||", "||"));
		System.out.println("----------------");
		System.out.println((System.nanoTime() - time) + "ns");
	}
	
	/**
	 * 입력받은 배열을 한줄씩 출력합니다.
	 * 
	 * @param array
	 */
	static void printArray(String[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
}
