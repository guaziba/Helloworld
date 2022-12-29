package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOop {
	boolean loop = true;
	Scanner scanner =new Scanner(System.in);
	String key ="";
	
	String details = "----- 零钱明细 ------";
	
	double money =0;
	double balance =0;
	Date date = null;
	SimpleDateFormat sdf =new SimpleDateFormat("yyyy-mm-dd HH:mm");
	String note ="";
	
	public void mainMenu() {
	System.out.println("显示零钱痛菜单。。。");

	do {
		System.out.println("\n\t\t\t======零钱通菜单======");
		System.out.println("\t\t\t1 零钱明细");
		System.out.println("\t\t\t2 收益入账");
		System.out.println("\t\t\t3 消费");
		System.out.println("\t\t\t4 退出");
		System.out.println("请选择（1-4）：");
		key = scanner.next();
		switch(key) {
		case"1":
			this.detail();
			break;
		case "2":
			this.income();
			break;
			
			
			
			
		case"3":
			this.pay();
			break;
		case"4":
			this.exit();
			
		
			break;	
		default:
			System.out.println("选择有误，请重新选择");
			
		}
		
}while(loop); 
	System.out.println("-----退出了零钱痛项目-----");
}
public void detail() {
	System.out.println(details);
	
	
}
public void income() {
	System.out.println("收益入账金额：");
	money = scanner.nextDouble();
	if(money <=0) {
	System.out.println("收入入账金额 需要 大于 0");
	return;
	}
	balance += money;
	 date = new Date();
//	 System.out.println(sdf.format(date)); 
details +="\n收益入账\t+"+money+ "\t"+sdf.format(date)+"\t"+balance;
	
}
public void pay() {
	System.out.println("消费金额：");
	money= scanner.nextDouble();
	if(money <=0|| money > balance) {
		System.out.println("收入入账金额 应在 0-"+balance);
		return;
		}
	System.out.println("消费说明：");
	note = scanner.next();
	balance -= money;
	date =new Date();
	details +="\n"+note+ "\t-"+money+"\t"+sdf.format(date)+"\t"+balance;	
	return;
}
public void exit(){
	String choice ="";
	
	while(true) {
		System.out.println("你确定要退出吗？y/n");
		choice = scanner.next();
		if("y".equals(choice)||"n".equals(choice)) {
			break;
		}
	}
	if(choice.equals("y")) {
		loop = false;
	}

	
	}
}
