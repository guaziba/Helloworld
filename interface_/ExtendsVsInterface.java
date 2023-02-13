package com.hspedu.interface_;

public class ExtendsVsInterface {
public static void main(String[] args){
	LittleMonkey wuKong = new LittleMonkey("悟空");
	wuKong.climling();
	wuKong.swimming();
}
}
class Monkey{
	private String name;
	public Monkey(String name) {
		this.name =name;
		
	}
	public void climling() {
		System.out.println(name+"会爬树。。。。");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
interface Fishale{
	void swimming();
	
}
class LittleMonkey extends Monkey implements Fishale {

	public LittleMonkey(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	} 
	public void swimming() {
		System.out.println(getName()+"通过学习，可以像鱼儿一样游泳");
		
	}
	
}