package com.hapedu.homwork10;

public class Homework03 {
public static void main(String[]args) {
	 Animal cat = new Cat();
	 Animal dog = new Dog();
	 cat.shout();
	 dog.shout();
}
}
abstract class Animal{
	public abstract void shout();
	
}
class Cat extends Animal{
	public  void shout() {
		System.out.println("猫会喵喵叫");
		
	
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("gou会wangwang叫");
}
	}