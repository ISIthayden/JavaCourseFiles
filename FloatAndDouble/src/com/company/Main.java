package com.company;

public class Main {

    public static void main(String[] args) {

	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
	    System.out.println("Float minimum value = " + myMinFloatValue);
	    System.out.println("Float maximum value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("double minimum value = " + myMinDoubleValue);
		System.out.println("double maximum value = " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);

		double lbs = 200;
		double kgs = lbs * .45359237;
		System.out.println(lbs + " lbs in kgs is: " + kgs + " kgs.");

		double pi = 3.1415927d;
		double anotherNumber = 3000000.456789;

		System.out.println(pi);
		System.out.println(anotherNumber);

    }
}
