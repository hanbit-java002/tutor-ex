package com.hanbit.ex01;

public class ForExercise {

	public static void main(String[] args) {
	
		// 1. 1부터 10까지의 합을 구하는 함수를 작성하세요.
		System.out.println(getSumOneToTen());
		
		// 2. 두개의 정수를 입력받아
		//    첫번째 수 부터 두번째 수까지의 합을
		//    구하는 함수를 작성하세요.
		int from = 10, to = 30;
		System.out.println(getSum(from, to));
		
	}

	static int getSumOneToTen() {
		int sum = 0;
		
		for (int i=1;i<=10;i++) {
			sum += i;
		}
		
		return sum;
	}
	
}
