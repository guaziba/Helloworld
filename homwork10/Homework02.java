package com.hapedu.homwork10;



public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 
		}
		}  
		class Frock{
			private static int currentNum = 100000;
			private int serialNumber;
			public Frock() {
				serialNumber = getNextNum(); 
			}
			public static int getNextNum() {
				currentNum += 100;
				return currentNum;
				
			}
			public int getSerialNumber() {
				return serialNumber;
			}
			public void setSerialNumber(int serialNumber) {
				this.serialNumber = serialNumber;
			}
			
		} 
		class TestFrock{
			public static void main(String[] args) {
				System.out.println(Frock.getNextNum());
				System.out.println(Frock.getNextNum());
				Frock frock = new Frock();
				System.out.println(frock.getSerialNumber());
			}
		}