package com.bridgelabz.findmaximum;

public class FindMaximum {
	public static void main(String[] args) {
		Integer number1 = 30;
		Integer number2 = 10;
		Integer number3 = 80;
		
		Double doubleNumber1 = 800.3;
		Double doubleNumber2 = 800.0;
		Double doubleNumber3 = 800.90;
		
		findMaximumNumber(number1, number2, number3);
		findMaximumNumber(doubleNumber1, doubleNumber2, doubleNumber3);
	}

	private static void findMaximumNumber(Double doubleNumber1, Double doubleNumber2, Double doubleNumber3) {
		// TODO Auto-generated method stub
		Double maximumNumber = doubleNumber1;
		if(Double.compare(maximumNumber, doubleNumber2) == -1) {
			maximumNumber = doubleNumber2;
		}
		if(Double.compare(maximumNumber, doubleNumber3) == -1) {
			maximumNumber = doubleNumber3;
		}
		System.out.println("Maximum no is :" +maximumNumber);
	}

	private static void findMaximumNumber(Integer number1, Integer number2, Integer number3) {
		// TODO Auto-generated method stub
		Integer maximumNumber = number1;
		if(Integer.compare(maximumNumber, number2) == -1) {
			maximumNumber = number2;
		}
		if(Integer.compare(maximumNumber, number3) == -1) {
			maximumNumber = number3;
		}
		System.out.println("Maximum no is :" +maximumNumber);
	}
}
