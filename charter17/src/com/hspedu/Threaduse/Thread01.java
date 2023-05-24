package com.hspedu.Threaduse;

public class Thread01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Cat cat =new Cat();
		cat.start();
		//cat.run();//run 方法就是一个普通的方法，没有真正的启动一个线程，就会把run方法执行完毕，才向下执行
		//这时 主线程和子线程是交替执行
System.out.println("主线程继续执行"+Thread.currentThread().getName());
for(int i =0;i<10;i++) {
	System.out.println("主线程 i="+i);
	Thread.sleep(1000);
}
	}	

		
}	
class Cat extends Thread{
int times =0;

	public void run() {
	while(true) {	
System.out.println("喵喵，我是小猫咪" + (++times));
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO: handle exception
	e.printStackTrace();
}
if(times ==8) {
	break;
}
	}
	
}
}
	


