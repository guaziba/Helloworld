package com.hspedu.exception_.homework;

public class TryCatchDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String str = "123";
		
		int a = Integer.parseInt(str);
		System .out.println("数字："+a);
	} catch (NumberFormatException e) {
		System .out.println("异常信息=" + e.getMessage());
		} finally {
		System.out.println("finaly代码块被执行。。.");
	}
		System.out.println("程序继续。。");
	}
}
