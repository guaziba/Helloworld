package com.hspedu.houserent.view;
import com.hspedu.houserent.utils.Utility;
import com.hspedu.houserent.servise.*;
import com.hspedu.houserent.domain.*;
public class HouseView {
private boolean loop = true;
private char key = ' ';
private HouseService houseService = new HouseService(10);
public void update() {
	System.out.println("============修改房屋信息==============");
	System.out.println("请选择修改房屋编号（-1表示退出）");
	int updateID = Utility.readInt();
    if(updateID == -1) {
    	System.out.println("==========你放弃修改房屋信息===========");
    	return;
    }
    House house = houseService.findById(updateID);
    if(house == null) {
    	System.out.println("============修改房屋信息不存在==========");
    	return;
    }
    System.out.println("姓名（"+house.getName()+"):");
    String name = Utility.readString(8,"");//如果用户直接回车表示不修改信息，默认“”
    if(!"".equals(name)) {
    	house.setName(name);
    	
    }
    System.out.println("电话（"+house.getPhone()+"):");
    String phone = Utility.readString(12,""); //如果用户直接回车表示不修改信息，默认“”
    if(!"".equals(phone)) {
    	house.setPhone(phone);
    	}
    
    System.out.println("地址（"+house.getAddress()+"):");
    String address = Utility.readString(18,""); //如果用户直接回车表示不修改信息，默认“”
    if(!"".equals(address)) {
    	house.setAddress(address);
    	}	
    System.out.println("租金（"+house.getRent()+"):");
int rent = Utility.readInt(-1); //如果用户直接回车表示不修改信息，默认“”
    if(rent != -1) {
    	house.setRent(rent);
    	}
    
    
    
    System.out.println("状态（"+house.getState()+"):");
    String state = Utility.readString(3,""); //如果用户直接回车表示不修改信息，默认“”
    if(!"".equals(state)) {
    	house.setState(state);
    	
    	}
    System.out.println("============修改房屋信息成功===========");
}



public void findHouse(){
	System.out.println("============查找房屋信息==============");
	System.out.println("请输入要查找的ID");
	int findId = Utility.readInt();
	House house = houseService.findById(findId);
	if(house != null) {
		System.out.println(house);
	}else {
		System.out.println("============没有查找信息==========");
		
	}
	
	
}

public void exit() {
	char c = Utility.readConfirmSelection() ;
	if(c == 'y') {
		loop = false;
	}
}
public void delHouse() {
	System.out.println("======删除房屋信息======");
	System.out.println("请输入待删除的编号（-1退出）：");
	int delId = Utility.readInt();
	if(delId == -1) {
		System.out.println("======放弃删除房屋信息房屋======");
		return;
}
	char choice = Utility.readConfirmSelection();
	if(choice =='Y') {
		if(houseService.del(delId)) {
			System.out.println("======删除房屋信息成功======");	
		}else {
			System.out.println("======编号不存在，删除房屋信息失败======");
		}
		
	}else {
		System.out.println("======放弃删除房屋信息房屋======");
	}
	
	
}



public void addHouse() {
	System.out.println("======添加房屋======");
	System.out.print("姓名： ");
	String name = Utility.readString(8);
	System.out.print("电话： ");
	String phone = Utility.readString(12);
	System.out.print("地址： ");
	String address = Utility.readString(16);
	System.out.print("月租金： ");
	int rent = Utility.readInt();
	System.out.print("状态（未出租/已出租： ");
	String state = Utility.readString(3);
	House newHouse = new House(0,name,phone,address,rent,state);
	if(houseService.add(newHouse)) {
		System.out.println("==========添加房屋成功==========");
		
	}else {
		System.out.println("==========添加房屋失败==========");
	}
}

//显示房屋列表
public void listHouses() {
	System.out.println("======房屋列表======");
	System.out.println("编号\t\t房主\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租");
	House[] houses =houseService.list();
	for(int i=0;i<houses.length;i++) {
		if(houses[i] == null) {//如果未空就不用显示
			break;
		}
		System.out.println(houses[i]);
	}
	System.out.println("========显示房屋列表完毕=======");
}


public void mainMenu() {
	do {
		System.out.println("==========房屋出租系统菜单=============");
		System.out.println("\t\t\t1 新 增 房 源");
		System.out.println("\t\t\t2 查 找 房 源");
		System.out.println("\t\t\t3 删 除 房 源 信 息");
		System.out.println("\t\t\t4 修 改 房 源 信 息");
		System.out.println("\t\t\t5 显 示 房 源 信 息");
		System.out.println("\t\t\t6 退    出");
		System.out.println("请输入你的选择（1-6）:");
		key = Utility.readChar();
		switch(key) {
		case'1':
			addHouse();
			break;
		case'2':
			findHouse();
			break;
		case'3':
			delHouse();
			break;
		case'4':
			update();
			break;
		case'5':
			listHouses();
			break;
		case'6':
			 exit();
			
			break;
		}
	}while(loop);
}
}
