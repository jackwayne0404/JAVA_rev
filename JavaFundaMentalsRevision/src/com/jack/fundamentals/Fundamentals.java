package com.jack.fundamentals;

import java.text.NumberFormat;
import java.util.Locale;

public class Fundamentals {
	
	
	public static void main(String[] args) {
		
		Locale[] curency= NumberFormat.getAvailableLocales();
		
		for(Locale l : curency) {
			System.out.println(l);
		}
		int result = curency.length;
		System.out.println(result);
		
		String resultOne= NumberFormat.getPercentInstance().format(0.2);
	
		//double d = Integer.parseInt(resultOne);
		System.out.println(resultOne);
	}

}
