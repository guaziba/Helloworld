package com.hspedu.interface_;

public class InterfacePolyArr {
public static void main(String[]args) {
	Usb[] usbs = new Usb[2];
	usbs[0]=new Phone();
	usbs[1]=new Camera();
	
	for(int i=0;i<usbs.length;i++) {
		usbs[i].work();
		if (usbs[i] instanceof Phone) { //判断他的运行类型 PHONE
			((Phone)usbs[i]).call();
			
		}
	}
}
}
interface Usb{
	
	void work();
}
class Phone implements Usb{
	public void call() {
		System.out.println("手机可以打电话。。。");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("手机工作中。。");
	}
}
class Camera implements Usb{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("相机工作中。。");
	}
	
}
