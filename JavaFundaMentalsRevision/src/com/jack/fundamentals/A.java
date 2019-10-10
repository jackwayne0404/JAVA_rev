package com.jack.fundamentals;

import java.util.Random;

public class A {
public static void main(String[] args) {
	Test a = new Test("t");
	a.print();
	
	
	var randGenerator = new Random();
	int count =0;
	while( count < 100) {
	System.out.println(randGenerator.nextFloat()*10);
	count++;
	}
}
}


class Test{
	
	String s;
	Test(String newS){
		s = newS;
	}
	
	public void print() {
		System.out.println(s);
	}
}
