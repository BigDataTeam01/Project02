package com.javalec.PDG;

import java.util.Scanner;

public class Ex_05 {
	
	
	/*
	 * Description : Sum of digits 
	 * Author  : ForrestDPark
	 * Date : 2023.11.30
	 * 
	 */
	
	// Properties
	
	// Field
	
	int sumOfDigit  = 0; // Digit Summation
	int inputNum 	= 0; // Input number
	int count 		= 0; // digit count 
	
	
	// Construct
	
	public Ex_05(){
		
	}
	
	// Method
	public void Ex_05() {
		
		System.out.println("===== Excercise 05 Start (PDG)=====");
		
		
		
		// Input 
		System.out.print("Enter an integer(0~9) : ");
		Scanner scanner = new Scanner(System.in);
		inputNum = scanner.nextInt();
		
		int inputNum_tmp=inputNum;
		
		
		
		// Process
		for(int i =0 ; inputNum != 0 ; i++) {
			//System.out.println(inputNum % 10);
			sumOfDigit += inputNum % 10;
			inputNum=inputNum / 10;
			count ++;
			
		}
		
//		System.out.println("sum of digit : "+ sumOfDigit);
		
		int [] inputNumArray = new int[count];
		
		for(int i =0; (inputNum_tmp%10 != 0);i++) {
			
			inputNumArray[i] = inputNum_tmp%10 ;
			
			
			//System.out.println((inputNumArray[i]));
			inputNum_tmp= inputNum_tmp/10;
			
			
		}
		System.out.println("Sum of digit : "+ sumOfDigit);
		
		System.out.println("\n===== End =====");
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
