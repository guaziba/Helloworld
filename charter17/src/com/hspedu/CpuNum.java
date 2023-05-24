package com.hspedu;

public class CpuNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runtime runtime =Runtime.getRuntime();
int cpuNums = runtime.availableProcessors();
System.out.println("当前有CPU个数=" + cpuNums);
	}

}
