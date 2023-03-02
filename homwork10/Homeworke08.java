package com.hapedu.homwork10;

public class Homeworke08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Color green = Color.YELLOW;
green.show();
switch (green) {
case YELLOW:
	System.out.println("匹配到黄色");
	break;
	
}
	}

}
interface IMyInterface{
	public void show();
	
}

enum Color{
	
	RED(255,0,0),BLUE(0,0,255), BLACK(0,0,0), YELLOW(255,255,0),GREEN(0,255,0);
 private int redValue;
	private int greenValue;
	private int blueValue;
	private Color(int redValue, int greenValue, int blueValue) {
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	public void show() {
		System.out.println("属性值为"+redValue +"，"+greenValue+"，"+blueValue );
	}
}