package com.hapedu.homwork10;

public class Homework06 {

	public static void main(String[] args) {
		
Person tang = new Person("唐僧",new Horse());
tang.common();
tang.passRiver();
tang.common();
tang.common();
tang.passRiver();
tang.common();
tang.passRiver();
tang.passRiver();
tang.passRiver();
	}

}
interface Vehicles {

	
	public  void work();
}

class Horse implements Vehicles{
	public void work() {
		System.out.println("一般情况下，使用马儿" );
		
	}
}
class Boat implements Vehicles{
	public void work() {
		System.out.println("过河的情况下，使用小船" );
	}
}
class VehiclesFactory {
	private static Horse horse = new Horse();
	private VehiclesFactory (){}
	public static Horse getHorse() {
		return horse;
	}
	public static Boat getBoat() {
		return new Boat(); 
	}
}
class Person{
	private String name;
	private Vehicles vehicles;
	public Person(String name,Vehicles vehicles) {
		this.name = name;
		this.vehicles = vehicles;
	}
	
	public void passRiver() {
		if(!(vehicles instanceof Boat)) {
			vehicles = VehiclesFactory.getBoat();
		}
		
		vehicles.work();
	}
	public void common() {
		if(!(vehicles instanceof Horse)) {
			vehicles = VehiclesFactory.getHorse();
		}
		
		vehicles.work();
	}
}