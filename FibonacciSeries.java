package com.java.basic_programs;

import java.util.Scanner;

/**
 * A simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13.. up to a given number.
 * 
 * @author Shraddha Nalawade
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) 
	{
		
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	           System.out.print(previousNumber+" ");
	           int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
	}
}
