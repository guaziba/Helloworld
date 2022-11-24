import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args) {
		
		int student =5;
		int class01 = 3;
		int pass01 =0;
		
		Scanner myScanner =new Scanner(System.in);
		int allclass =0;
		for(int i=1;i<=class01;i++) {
			int sum01 = 0;
				for(int j=1;j<=student;j++) {
			System.out.println("请数第"+i+"班的第"+j+"个学生的成绩");
			
		int score = myScanner.nextInt();
		if(score >= 60) {
			pass01++;
			
		}
		System.out.println("成绩为"+score);
		sum01 += score;
		}
				
		System.out.println("平均成绩为"+sum01/student);
		allclass += sum01;
		
		}
		System.out.println("平均成绩"+allclass/(student*class01));
		System.out.println("总成绩为"+allclass);
		System.out.println("总合格人数为"+pass01);
	}
}
