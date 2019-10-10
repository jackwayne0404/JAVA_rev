package com.jack.procedural;

public class Employee {
	private int baseSalary;
	private int hourlyRate;

	public Employee(int baseSalary, int hourlyRate) {
		super();
		try {
			setHourlyRate(hourlyRate);
			setBaseSalary(baseSalary);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private int getBaseSalary() {
		return baseSalary;
	}

	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0)
			throw new IllegalArgumentException("Cannot be nagative");
		this.baseSalary = baseSalary;
	}

	private int getHourlyRate() {
		return hourlyRate;
	}

	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate <= 0)
			throw new IllegalArgumentException("Cannot be nagative");

		this.hourlyRate = hourlyRate;
	}

	public int calculateWage(int extraHours) {
		if (extraHours < 0)
			throw new IllegalArgumentException("Cannot be nagative");

		return baseSalary + (hourlyRate * extraHours);
	}

	public int calculateWage() {

		return calculateWage(0);
	}

}
