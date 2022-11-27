public class ArrayExcercise01{
	public static void main(String[] args) {
		int arr01[] = {2,3,55,33,222,233,32};
		int max = arr01[0];
		int maxindex = 0;
		for(int i=1;i<arr01.length;i++) {
			if(max<arr01[i]) {
				max = arr01[i];
				maxindex = i;
				
			}
		}
		System.out.println("max="+max+"maxindex="+maxindex);
	}
}