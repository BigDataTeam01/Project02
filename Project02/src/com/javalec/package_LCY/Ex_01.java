package com.javalec.LCY;

public class Ex_01 {
	
	
	public Ex_01() {
		
	}
	
	
	public void printSquareNumber() {
		long num = 1;
		int a = 10;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%12d", num));
			num *= a;
		}
	}
	
}
