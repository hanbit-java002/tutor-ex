package com.hanbit.ex01;

import java.util.Arrays;

public class AttendanceBook {

	public static void main(String[] args) {
		final String students = "정동건, 문재승, 한지훈"
			+ ", 백수현,조영욱,이상윤"
			+ ", 백미리,박재홍,김지룡"
			+ " ,노상민, 김한슬,채성주";

		/*
		 * 다음처럼 출력하시오.
		 * 
		 * 01. 김지룡
		 * 02. 김한슬
		 * 03. 노상민
		 * ...
		 * 12. 한지훈
		 */		
		System.out.println(createAttendanceBook(students));
		
		// 다음 학생이 몇번인지 출력하세요.
		System.out.println(getNumber("백미리"));
	}

	static String createAttendanceBook(String students) {
		if (students == null) {
			return "";
		}
		
		String result = "";
		
		String[] studentsArray = StringUtils03.splitNotBlankAndTrim(students, ",");
		
		Arrays.sort(studentsArray);
		
		int size = String.valueOf(studentsArray.length).length() + 2;
		
		for (int i=0;i<studentsArray.length;i++) {
			String student = studentsArray[i];
			
			result += StringUtils01.leftPad((i+1) + ". ", size, '0') + student + '\n';
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
