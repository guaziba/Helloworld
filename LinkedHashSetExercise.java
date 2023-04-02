package com.hspedu.homework;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet linkedHashSet =new LinkedHashSet();
linkedHashSet.add(new Car("奥拓",1000));
linkedHashSet.add(new Car("奥迪",300000));
linkedHashSet.add(new Car("法拉利",10000000));
linkedHashSet.add(new Car("奥迪",300000));
linkedHashSet.add(new Car("保时捷",700000));
linkedHashSet.add(new Car("奥迪",300000));
System.out.println("linkedHashSet="+linkedHashSet);
	}

}
class Car{
	private String name;
	private double price;
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
}