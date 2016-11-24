package com.hanbit.ex01;

public class ForAndArray {

	public static void main(String[] args) {
	
		// 1. 시작월부터 12월까지의 월명을 배열로 반환하세요.
		//  ex: startMonth = 3 -> {"3월", "4월", ... , "12월"}
		int startMonth = 3;
		String[] monthNames = getMonthNames(startMonth);
		
		System.out.print("[");
		for (int i=0;i<monthNames.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(monthNames[i]);
		}
		System.out.println("]");
		
		// 2. 주어진 배열의 부분 배열을 반환하는 함수를 작성하세요.
		int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int startIndex = 2;	// 시작인덱스
		int length = 4;		// 부분 배열의 길이
		int[] subNumbers = getSubArray(numbers, startIndex, length);
		
		System.out.print("[");
		for (int i=0;i<subNumbers.length;i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			
			System.out.print(subNumbers[i]);
		}
		System.out.println("]");
	}

	static String[] getMonthNames(int startMonth) {
		String[] monthNames = new String[12 - startMonth + 1];
		
		for (int m=startMonth, i=0; m<=12; m++, i++) {
			monthNames[i] = m + "월";
		}
		
		return monthNames;
	}
	
}
