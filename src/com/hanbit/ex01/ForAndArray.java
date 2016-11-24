package com.hanbit.ex01;

public class ForAndArray {

	public static void main(String[] args) {
	
		// 1. 시작월부터 12월까지의 월명을 배열로 반환하세요.
		//  ex: startMonth = 3 -> {"3월", "4월", ... , "12월"}
		int startMonth = 3;
		String[] monthNames = getMonthNames(startMonth);
		
		for (String monthName : monthNames) {
			System.out.println(monthName);
		}
		
		for (int i=0;i<monthNames.length;i++) {
			String monthName = monthNames[i];
			
			System.out.println(monthName);
		}
	}

	static String[] getMonthNames(int startMonth) {
		String[] monthNames = new String[12 - startMonth + 1];
		
		for (int m=startMonth, i=0; m<=12; m++, i++) {
			monthNames[i] = m + "월";
		}
		
		return monthNames;
	}
	
}
