public class ForBreak{
	public static void main(String[] args) {
		//  某人有100，000元，没经过一次路口，需缴费，规则如下；
		// 当现金》50000的时候 每次交5%
		// 当现金《=50000时候，每次交1000
		//这个人能交多少多少次

		double i =100000;
		int count = 0;
		
		while(true) {
			if(i>50000) {
			i=i-i*0.05;
			count++;
			}
			else if(i<=50000 && i>1000)	{
				i =i -1000;
				count++;}
			else {
			break;
		}
		}
			
		System.out.println(i+"可以过"+count+"路口");
		
	}
}