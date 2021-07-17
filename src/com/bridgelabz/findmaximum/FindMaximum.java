package com.bridgelabz.findmaximum;

public class FindMaximum {
	public static void main(String[] args) {
		Integer number1 = 30;
		Integer number2 = 10;
		Integer number3 = 80;
		
		Double doubleNumber1 = 800.3;
		Double doubleNumber2 = 800.0;
		Double doubleNumber3 = 800.90;
		
		String fruit1 = "Apple";
		String fruit2 = "Banana";
		String fruit3 = "Peach";
		
		findMaximumNumber(number1, number2, number3);
		findMaximumNumber(doubleNumber1, doubleNumber2, doubleNumber3);
		findMaximumString(fruit1, fruit2, fruit3);
	}

	private static void findMaximumString(String fruit1, String fruit2, String fruit3) {
		// TODO Auto-generated method stub
		String maxmimumString = fruit1;
		if(maxmimumString.compareTo(fruit2) < 0) {
			maxmimumString = fruit2;
		}
		if(maxmimumString.compareTo(fruit3) < 0) {
			maxmimumString = fruit3;
		}
		System.out.println("Maximum String is : " + maxmimumString);
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
