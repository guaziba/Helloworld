package com.hspedu.Threaduse;

public class Thread02 {
	public static void main(String[] args) {
Dog dog = new Dog();

Thread thread =new Thread(dog);
	
thread.start();
}
	}

	class Dog implements Runnable {
		int times = 0;
		public void run() {
		while (true) {
		//休息(睡眠)一秒
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		System.out.println("hi!" + (++ times)+Thread.currentThread());
		if(times == 10) {
			break;
		}
}}}