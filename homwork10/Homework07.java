package com.hapedu.homwork10;

public class Homework07 {
 public static void main(String[]args) {
	 Car car =new Car(60);
	 car.getAir().flow();
	 Car car2 =new Car(-10);
	 car2.getAir().flow();
	 Car car3 =new Car(30);
	 car3.getAir().flow();
	 }
}
class Car{
	private double temperature;
	
	public Car(double temperature) {
		super();
		this.temperature = temperature;
	}

	class Air{
		public void flow() {
			if(temperature > 40) {
				System.out.println("温度大于40度 空调吹冷气。。。");
				
			}else if(temperature<0) {
				System.out.println("温度小于0度 空调吹暖风。。。");
			}else {
				System.out.println("温度正常，关闭空调。。。");
			}
		}
	}
	
	public Air getAir() {
		return new Air();
		
	}
}