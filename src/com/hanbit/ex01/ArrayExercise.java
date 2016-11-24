package com.hanbit.ex01;

public class ArrayExercise {

	public static void main(String[] args) {
		
		// 1. 1월부터 12월까지 영문 월명을 담고있는
		//    배열을 만들어 반환하세요.
		//    단, {"January", ... "December"} 문법 제외
		String[] monthNames = createMonthNameArray();
		printArray(monthNames);		
	}
	
	static void printArray(String[] array) {
		System.out.print("[");
		for (int i=0;i<array.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(array[i]);
		}
		System.out.println("]");
	}
}
