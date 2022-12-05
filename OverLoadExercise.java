public class OverLoadExercise{
	public static void main(String[] args) {
	Methods method = new Methods();	
	method.m(10);
	method.m(2,4);
	method.m("大家好");
	}
}
class Methods{
	public void m(int n) {
		System.out.println(("平方="+n*n));
	}
	public void m(int n1,int n2) {
		System.out.println(("相乘="+n1*n2));
	}
	public void m(String str) {
	System.out.println(("传入的str="+str));
	}
}