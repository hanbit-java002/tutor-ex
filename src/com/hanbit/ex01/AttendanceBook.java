package com.hanbit.ex01;

public class AttendanceBook {

	public static void main(String[] args) {
		final String students = "정동건, 문재승, 한지훈"
			+ ", 백수현,조영욱,이상윤"
			+ ", 백미리,박재홍,김지룡"
			+ " ,노상민, 김한슬,채성주";

		/*
		 * 다음처럼 출력하시오.
		 * 
		 * 01. 정동건
		 * 02. 문재승
		 * 03. 한지훈
		 * ...
		 * 12. 채성주
		 */		
		System.out.println(createAttendanceBook(students));
	}

	static String createAttendanceBook(String students) {
		if (students == null) {
			return "";
		}
		
		String result = "";
		
		String[] studentsArray = StringUtils03.splitNotBlankAndTrim(students, ",");
		
		for (int i=0;i<studentsArray.length;i++) {
			String student = studentsArray[i];
			
			result += (i+1) + ". " + student + '\n';
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
