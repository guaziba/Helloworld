public class Recursion02{
	public static void main(String[] args){
	S a = new S();
	int res=a.factorial(5);
	System.out.println("结果是 "+res);
	}

}
class S{
	public int factorial(int n) {
	if(n==1) {
		return 1;
		
	}else {
		return factorial(n-1)*n;
		
	}
	}
}