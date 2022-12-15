package com.hspedu.extend_exercise;
public class ExtendsExericise02{
	public static void main(String[]args) {
		C c =new C();
	}

	
}
class A {
	public A() {
		System.out.println("我是A类");
	}
}
class B extends A{
	public B() {
		System.out.println("我是B类无参构造");	
	}

public B(String name){
	System.out.println("我是B类有参构造");
	
}
}
class C extends B{
	public C() {
		this("hello");
		System.out.println("我是C类无参构造");	
	}
	public C(String name) {
		super("hahah");
		System.out.println("我是C类有参构造");	
	}
	
}