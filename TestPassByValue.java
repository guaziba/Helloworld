public class TestPassByValue{
	public static void main(String[]args) {
		int num1 = 1;
		int num2 = 2;
		System.out.println("交还前 num1 的值为： " +num1 + " ，num2的值为：" +num2);
		swap(num1,num2);
		System.out.println("交还前 num1 的值为： " +num1 + " ，num2的值为：" +num2);
	}
public static void swap(int n1,int n2) {
	System.out.println("\t进入swap方法");
	System.out.println("\t\t交换前n1的值为："+ n1 +"，n2的值:" + n2);
	int temp = n1;
	n1 = n2;
	n2 = temp;
	System.out.println("\t\t交换后n1的值为：" + n1+ "，n2的值：" + n2);

}
}