package com.java.basic_programs;

import java.util.Scanner;

/**
 * A Java program to check if a given number is prime or not.
 * 
 * @author Shraddha Nalawade
 * @date 10/09/2018
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int i,m=0,flag=0;    
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scan.nextInt();
		if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		}
		else{
			for(i=2;i<=n;i++){    
			if(n%i==0){    
			System.out.println(n+" is not prime number");    
			flag=1;    
			break;    
		}    
		   }    
		   if(flag==0)  { 
			   System.out.println(n+" is prime number"); 
			   }
		  }
		}  
	
}
	

