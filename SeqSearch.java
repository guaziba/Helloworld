import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
	String[] name01 = {"金毛狮王","白眉鹰王","紫衫龙王","青翼蝠王"};		
		Scanner myScanner = new Scanner(System.in);
	System.out.println("请输入名字");
	String findName = myScanner.next();
	
	int index =-1;
	for(int i = 0;i<name01.length;i++) {
		if(findName.equals(name01[i])) {
			System.out.println("找到"+findName);
			System.out.println("下标为"+i);
			index=i;
			break;
			
			
		}
	}
	if (index==-1) {
		System.out.println("没有找到");
	}
	}
	}