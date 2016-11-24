package com.hanbit.ex01;

public class ParameterExercise {

	public static void main(String[] args) {
		
		int number = 5;
		
		changeParameter(number);
		
		System.out.println(number);
		
	}
	
	static void changeParameter(int number) {
		number = number + 1;
	}
	
}
