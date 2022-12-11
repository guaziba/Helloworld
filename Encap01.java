package com.hsedu.pkg;
public class Encap01{
	public static void main(String[] args) {
		Person person =new Person();
		person.setName("jack");
		person.setAge(300);
		person.setSalary(30000);
	System.out.println(person.info()); 
	Person hallo = new Person("hallo",777,4000);
	
	System.out.println(hallo.info()); 
	}
}
class Person{
	public String name;
	private int age;
	private double salary;
	
	public Person() {
		
	}
	
	
	
	
	public Person(String name, int age, double salary) {
	
		setName(name);
		setAge(age);
		setSalary(salary);
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 6) {
		this.name = name;
		}else {
			System.out.println("名字的长度不对，需要（2-6）个字符，默认名字");
			this.name ="无名人";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=1 && age <=120) {
		this.age = age;
		}else {
			System.out.println("年龄需要在1-120");
			this.age = 18;
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String info() {
		return "信息为name="+name+ " age="+ age +   " salary= " + salary; 
	}
	
}