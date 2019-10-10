package com.jack.fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal;
		final byte monthsInAYear=12;
		Scanner in = new Scanner(System.in);
		do {
		System.out.print("Principal : ");
		principal = in.nextDouble();
		}while(principal <1000 || principal >1000000);
		System.out.println(" whats your annual interest rate ? :");
		double interestRate = in.nextDouble();
		double actualRate = (interestRate/monthsInAYear)/100;
		System.out.println(actualRate);
		System.out.println(" Over how many years :");
		int numberofPeriods = in.nextInt()*12;
		double d = Math.pow(1+actualRate, numberofPeriods)-1;
		double d2 = actualRate*Math.pow(1+actualRate, numberofPeriods);
		double monthlyPayment = payments(d, d2);
		String result = NumberFormat.getCurrencyInstance().format(monthlyPayment*principal);
	System.out.println("Your Monthly Payment is : " +result );
	in.close();
		
		int score = 10000;
		String rank = score >9999? "First ": " second";
		
		System.out.println(rank);
	
	}

	private static double payments(double d, double d2) {
		double monthlyPayment = d2/d;
		return monthlyPayment;
	}

}
