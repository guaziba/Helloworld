public class ForExercise{
	public static void main(String[] args) {
	int count = 0;
	int sum1 = 0 ;
	int a = 1;
	int b = 100;
	int t = 9;
		for(int i = a;i <= b;i++) {
		if (i % t == 0) {
		System.out.println("i=" + i);
		count ++;
		sum1 += i;
		}
		
		}
		System.out.println(count);
		System.out.println(sum1);
	
	}
}