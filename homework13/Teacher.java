package com.hspedu.homework.homework13;

public class Teacher extends Person {
	
	private int work_id;
	public Teacher(String name, char gender, int age, int work_id) {
		super(name,gender,age);
		
		this.work_id = work_id;
	}
	
	public int getWork_id() {
		return work_id;
	}
	public void setWork_id(int work_id) {
		this.work_id = work_id;
	}
	public void teach() {
		System.out.println("我承诺教好JAVA");
		
	}
	public String play() {
		return super.play()+"象棋";
		
	}
	public void printInfo() {
		System.out.println("老师的信息：");
		System.out.println(super.basicInfo());
		System.out.println("工龄："+work_id);
		teach();
		System.out.println(play());
	}

	@Override
	public String toString() {
		return "Teacher [work_id=" + work_id + "]"+ super.toString();
	}
	
}
