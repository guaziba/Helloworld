package com.hapedu.homwork10;

public class Homework05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new A().f1();
}

}
class A{
	private String NAME = "hello";
	public void f1() {
		class B{
			private final String NAME = "韩顺平教育";
			public void shou() {
				System.out.println("NAME="+ NAME +"外部类的NAME="+A.this.NAME);
				
			}
		}
		B b =new B();
		b.shou();
	}
}