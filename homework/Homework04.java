package com.hspedu.homework;

public class Homework04 {
public static void main(String[]args) {
	Manager manager = new Manager("刘备",100,20,1.2);
	manager.setBonus(3000);
	manager.printSal();
	Worker woker = new Worker("关羽",100,30,1.0);
	woker.printSal();
}
}
