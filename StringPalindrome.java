package com.java.basic_programs;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String args[]){
	String original;
	String reverse = "";
	System.out.println("Please enter a string");
	
	Scanner scan = new Scanner(System.in);
	original = scan.next();

	for(int i = original.length() -1; i >=0;i--)
	{
		reverse = reverse + original.charAt(i);

	}
	if(original.equals(reverse))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is not a palindrome");
	}
	}
}
