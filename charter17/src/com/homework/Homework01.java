package com.hspedu.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a =new A();
B b = new B(a);
a.start();
b.start();

	}

}
class A extends Thread{
	private boolean loop = true;
	public void run() {
		while(loop) {
			System.out.println((int)(Math.random()*100+1));
			
		
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
	public void setLoop(boolean loop) {
		this.loop =loop;
	}
}
class B extends Thread{
	private A a;
	private Scanner scanner =new Scanner(System.in);
	public B(A a) {
		this.a =a;
		
		
	}
	public void run() {
		System.out.println("请输入指令");
	
		char key = scanner.next().toUpperCase().charAt(0);
		if(key == 'Q') {
			a.setLoop(false);
			System.out.println("退出线程");
		
		}
	}
	
}