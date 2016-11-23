package com.hanbit.ex01;

public class StudyFunctions {

	public static void main(String[] args) {
		
		// 1. 변수로 받은 문자열을 출력하는 함수를 작성하세요.
		printString("Hello");

		// 2. 변수로 받은 월에 따라 영문 월명을 출력하세요.
		//   ex: month = 1 -> January
		//   ex: month = 2 -> February
		int month = 5;
		printMonthName(month);
		
		// 3. 변수로 받는 년, 월에 따라 영문 월명과
		//    해당 년월의 날짜 수를 출력하세요.
		//   출력예: 2016년 5월 : May (31일)
		int year = 2016;
		printMonthNameAndDays(year, month);
	}
	
	static void printMonthNameAndDays(int year, int month) {
		// 월의 영문 월명을 구한다.
		
		// 년 월의 날짜 수를 구한다.
		
		// 출력형식에 맞추어 출력한다.
		
	}
	
	private static void printMonthName(int month) {
		String monthName = getMonthNameUsingArray(month);
		
		System.out.println(monthName);
	}

	static String getMonthNameUsingArray(int month) {
		String[] monthNames = new String[] {
				"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};
		
		return getKeyAndValue(month + "월", monthNames[month - 1]);
	}

	static String getMonthNameUsingIf(int month) {
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
		
		return getKeyAndValue(month + "월", monthName);
	}

	static String getKeyAndValue(String key, String value) {
		
		return key + " : " + value; 
	}
	
	static void printString(String string) {
		System.out.println(string);
	}
	
}
