package com.jack.procedural;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {

		var employee = new Employee(5_000, 10);

		int wage = employee.calculateWage();
		String salary = NumberFormat.getCurrencyInstance().format(wage);
		System.out.println(salary);

	}

}
