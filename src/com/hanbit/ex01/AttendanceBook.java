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
		 * 1. 정동건
		 * 2. 문재승
		 * 3. 한지훈
		 * ...
		 * 12. 채성주
		 */		
		System.out.println(createAttendaceBook(students));
	}
	
}
