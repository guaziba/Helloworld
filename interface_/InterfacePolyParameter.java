package com.hspedu.interface_;

public class InterfacePolyParameter {
	public static void main(String[] args) {
		IF if01 =new Monster();
		if01 = new car();
		
		AAA a = new BBB();
		a = new CCC();
		
	}

}
interface IF{
	
}
class Monster implements IF{
	
}
class car implements IF{}
class AAA {
	
}
class BBB extends AAA{
	
}
class CCC extends AAA{
	
}