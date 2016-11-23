package com.hanbit;

public class CalendarUtils {

	public static void main(String[] args) {
	
		// 해당 년월의 날짜 수를 출력하세요.
		int year = 2015;
		int month = 2;
		System.out.println(getDaysOfMonth(year, month));
		
		// 해당 년의 총 날짜 수를 출력하세요.
		System.out.println(getDaysOfYear(year));
		
		// 3개의 정수 값을 받아 앞의 두 값을 더하고 세번째 값을
		// 빼는 함수를 작성하세요.
		System.out.println(plusAndMinus(4, 5, 3));

		// 3개의 정수 값을 받아 앞의 두 값을 더하고 세번째 값을 
		// 곱하는 함수를 작성하세요.
		System.out.println(plusAndMultiply(4, 5, 3));

		// 3개의 정수 값을 받아 앞의 두 값을 더하고 그 합이
		// 짝수이면 세번째 값을 곱하고
		// 홀수이면 세번쨰 값을 빼는
		// 함수를 작성하세요.
		System.out.println(plusAndMultiplyOrMinus(4, 5, 3));
	}
	
	static int plusAndMultiplyOrMinus(int i, int j, int k) {

		int sum = plus(i, j);
		
		if (sum % 2 == 0) { // 짝수이면
			return multiply(sum, k);
		}
		else { // 홀수이면
			return minus(sum, k);
		}
	}

	static int plusAndMinus(int x, int y, int z) {
		
		return minus(plus(x, y), z);
	}
	
	static int plusAndMultiply(int i, int j, int k) {

		return multiply(plus(i, j), k);
	}

	static int multiply(int x, int y) {

		return x * y;
	}

	static int plus(int x, int y) {
		
		return x + y;
	}
	
	static int minus(int x, int y) {
		
		return x - y;
	}
	
	static int getDaysOfYear(int year) {
		
		// case 1. 각 월의 일수 총합
		// int days = getDaysOfMonth(year, 1) 
		// 			+ getDaysOfMonth(year, 2) + ...
		
		// case 2. 4의 배수 년도는 366일, 그 외는 365일
		if (year % 4 == 0) {
			return 366;
		}
		
		return 365;
	}
	
	static int getDaysOfMonth(int year, int month) {
		
		switch (month) {
		// 월 별로 비교해서 각 월에 맞는 날짜 수를 리턴
		// 1, 3, 5, 7, 8, 10, 12월은 31일
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
		// 4, 6, 9, 11월은 30일
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
		// 단, 2월은 추가 로직을 적용해서 날짜 수를 리턴
		// 4의 배수 년도는 29일, 그 외는 28일
			case 2:
				return year % 4 == 0 ? 29 : 28;
		}
		
		return 0;
	}
	
	static int getDaysOfMonth2(int year, int month) {
		int days;
		
		if (month == 1) {
			days = 31;
		}
		else if (month == 2) {
			if (year % 4 == 0) {
				days = 29;
			}
			else {
				days = 28;
			}
		} 
		else if (month == 3) {
			days = 31;
		} 
		else if (month == 4) {
			days = 30;
		} 
		else if (month == 5) {
			days = 31;
		} 
		else if (month == 6) {
			days = 30;
		} 
		else if (month == 7) {
			days = 31;
		} 
		else if (month == 8) {
			days = 31;
		} 
		else if (month == 9) {
			days = 30;
		} 
		else if (month == 10) {
			days = 31;
		} 
		else if (month == 11) {
			days = 30;
		} 
		else if (month == 12) {
			days = 31;
		}
		else {
			days = 0;
		}
		
		return days;
	}
	
	static int getDaysOfMonth3(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 
				|| month == 8 || month == 12) {
			return 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		else if (month == 2 && year % 4 == 0) {
			return 29;
		}
		else if (month == 2 && year % 4 != 0) {
			return 28;
		}
		
		return 0;
	}
	
}
