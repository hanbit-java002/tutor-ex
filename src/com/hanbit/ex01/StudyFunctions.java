package com.hanbit.ex01;

public class StudyFunctions {

	public static void main(String[] args) {
		
		// 1. 변수로 받은 문자열을 출력하는 함수를 작성하세요.
		printString("Hello");

		// 2. 변수로 받은 월에 따라 영문 월명을 출력하세요.
		//   ex: month = 1 -> January
		//   ex: month = 2 -> February
		int month = 5;
		printMonthNameUsingIf(month);
		printMonthNameUsingArray(month);
		
		// 3. 변수로 받는 년, 월에 따라 영문 월명과 해당 년월의 날짜 수를 출력하세요.
		int year = 2016;
		printMonthNameAndDays(year, month);
	}
	
	static void printMonthNameUsingArray(int month) {
		String[] monthNames = new String[] {
				"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};
		
		printKeyAndValue(month + "월", monthNames[month - 1]);
	}

	static void printMonthNameUsingIf(int month) {
		String monthName = "";
		
		if (month == 1) {
			monthName = "January";
		}
		else if (month == 2) {
			monthName = "February";
		}
		else if (month == 3) {
			monthName = "March";
		}
		else if (month == 4) {
			monthName = "April";
		}
		else if (month == 5) {
			monthName = "May";
		}
		else if (month == 6) {
			monthName = "June";
		}
		else if (month == 7) {
			monthName = "July";
		}
		else if (month == 8) {
			monthName = "August";
		}
		else if (month == 9) {
			monthName = "September";
		}
		else if (month == 10) {
			monthName = "October";
		}
		else if (month == 11) {
			monthName = "November";
		}
		else if (month == 12) {
			monthName = "December";
		}
		
		printKeyAndValue(month + "월", monthName);
	}

	static void printKeyAndValue(String key, String value) {
		System.out.println(key + " : " + value);
	}
	
	static void printString(String string) {
		System.out.println(string);
	}
	
}
