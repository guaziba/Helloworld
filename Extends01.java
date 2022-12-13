package com.hspedu.extend.improve_;

public class Extends01{
	public static void main(String[] args) {
		Pupli pupli =new Pupli();
		
	pupli.name="银角大王";
	pupli.age=10;
	pupli.testing();
	pupli.setScore(60);
	pupli.showInfo();
	
	System.out.println("===========");
	Graduate graduate =new Graduate();
	graduate.name = "金角大王";
	graduate.age = 22;
	graduate.testing();
	graduate.setScore(100);
	graduate.showInfo();
	}
	
}