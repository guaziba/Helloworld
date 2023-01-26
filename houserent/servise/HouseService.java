package com.hspedu.houserent.servise;

import com.hspedu.houserent.domain.House;

public class HouseService {
	private House[] houses;
	private int houseNums = 1;
	private int idCounter = 1;
	public HouseService(int size) {
		houses = new House[size];
		houses[0] = new House(1,"jack","112","海淀区XX小区X单元",2000,"未出租");
		
		}
	public House findById(int findId) {
		for(int i=0;i<houseNums;i++) {
			if(findId==houses[i].getId()) {
				return houses[i];
				
			}
		}
		return null;
	}
	
	
	
	
	
	
	public boolean del(int delId) {
		int index = -1;
		for(int i= 0; i<houseNums;i++) {
			if(delId == houses[i].getId()) {//要删除的房屋ID，是数组下标为i的元素
			index =i;//就使用index记录i	
			}
		}
	if(index == -1){
	
	return false;
	}
	for(int i = index;i< houseNums-1;i++) {
		houses[i]=houses[i+1];
	}
	houses[--houseNums]= null;//把当有存在的房屋信息的最后一个 设置null
	return true;
	}
	
	
	
	
public boolean add(House newHouse) {
	if(houseNums == houses.length) {
		System.out.println("数组已满不能添加");
		return false;
		
	}
	houses[houseNums++] = newHouse;
idCounter++;
newHouse.setId(++idCounter);
return true;
	
}
	
	
	
	public House[] list(){
		return houses;
		
	}
	

}
