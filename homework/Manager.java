package com.hspedu.homework;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double daySal, int workDays, double grade) {
		super(name, daySal, workDays, grade);
		// TODO Auto-generated constructor stub
	}
	public void printSal() {
		System.out.println("经理 "+ getName() +" 工资="+( bonus+getDaySal()*getWorkDays()*getGrade()));
	}
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	

}
