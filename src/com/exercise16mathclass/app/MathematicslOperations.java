package com.exercise16mathclass.app;

import java.util.Scanner;

public class MathematicslOperations {

	public static void main(String[] args) 
	{
		//
		double number = 0;
		double number1 = 3.76;
		double number2 = 5.5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("e value: "+Math.E);
		System.out.println("pi value: "+Math.PI);
		System.out.println("Absolute value of -2.15 is: "+ Math.abs(-2.15));
		System.out.println("The cube root of 27 is: "+Math.cbrt(27));
		System.out.println("The round of 3.76: "+Math.round(number1));
		System.out.println("The round ceil of 3.76: "+Math.ceil(number1));
		System.out.println("The round floor of 3.76: "+Math.floor(number1));
		System.out.println("Increment of 5: "+Math.incrementExact(5));
		System.out.println("Decrement of 5: "+Math.decrementExact(5));
		System.out.println("Power value of 3 Euler is: "+Math.exp(3));
		System.out.println(String.format("Whitch is bigger? %.2f or %.2f: %.2f", number1, number2, Math.max(number1,number2)));
		System.out.println(String.format("Whitch is smaller? %.2f or %.2f: %.2f", number1, number2, Math.min(number1,number2)));
		System.out.println("Sin of 0 degrees is: "+Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: "+Math.sin(Math.PI/2));
		System.out.println("Cos of 0 degrees is: "+Math.cos(0));
		System.out.println("Cos of PI/2 degrees is: "+Math.cos(Math.PI/2));
		for(int i=0; i<5; i++)
		{
			System.out.print("Input a number: ");
			number = input.nextDouble();
			System.out.println("The square of: "+number+" is "+Math.pow(number, 2));
		}
		
	}

}
