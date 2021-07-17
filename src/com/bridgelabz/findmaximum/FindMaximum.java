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
		
		FindMaximum(number1, number2, number3);
		FindMaximum(doubleNumber1, doubleNumber2, doubleNumber3);
		FindMaximum(fruit1, fruit2, fruit3);
	}

	public static<T extends Comparable<T>> void FindMaximum(T value1, T value2, T value3) {
		T maximum = value1;
		if(maximum.compareTo(value2) < 0) {
			maximum = value2;
		}
		if(maximum.compareTo(value3) < 0) {
			maximum = value3;
		}
		System.out.println("The maximum is: " + maximum);
	}
}
