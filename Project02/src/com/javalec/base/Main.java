package com.javalec.base;

import java.util.Scanner;

import com.javalec.LCY.Ex_01;
import com.javalec.PDG.Ex_05;
import com.javalec.PJH.Ex_02;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex_01 x1 = new Ex_01();
		Ex_02 x2 = new Ex_02();
		Ex_05 x3 = new Ex_05();
		int num = 0;
		
		
			while(num != 4) {
				System.out.println("1.Ex1");
				System.out.println("2.Ex2");
				System.out.println("3.Ex3");
				System.out.println("4.종료");
				System.out.println("번호를 입력하세요 : ");
				num = sc.nextInt();
				if(num == 1) {
					x1.printSquareNumber();
					System.out.println("-----------");
				}
				if(num == 3) {
					x3.Ex_05();
				}
				if(num == 2) {
					x2.ji();
					System.out.println("-----------");
				}
			}

	}
}