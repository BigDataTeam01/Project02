package com.javalec.PJH;

import java.util.Scanner;

public class Ex_02 {

	//Field
	
	
	
	//Constructor
	public Ex_02() {
		
	}
	
	
	//method
	public void ji() {
		int inputNum = 0;
		int factorial = 1;
		
		// Input
		
		System.out.print("Input your decimal no. : ");
		Scanner scanner = new Scanner(System.in);
		
		inputNum = scanner.nextInt();
		
		// Process
		for(int fi=1 ; fi < inputNum ; fi++) {			
			factorial *= fi+1 ;
		}
		
		
		// Output
		System.out.println(inputNum +"'s factorial value =  "+ factorial);
		
		
		
	}
	
}
