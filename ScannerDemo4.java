import java.util.Scanner;
public class ScannerDemo4 {
	public static void main(String[]args) {
		System.out.println("请输入数字：");
		Scanner scan1 = new Scanner(System.in);
		double sum = 0;
		int m =0;
		while (scan1.hasNextDouble()) {
			double x = scan1.nextDouble();
			m = m + 1;
			sum = sum + x;
		}
			System.out.println(m + "个数的和为" + sum);
	        System.out.println(m + "个数的平均值是" + (sum / m));
	        scan1.close();
		}
	}
