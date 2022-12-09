public class Homework02{
	public static void main(String[] args) {
	String[] strs = {"jack","tom","mary","milan"};
	A02 a02= new A02();
	int index = a02.find("to", strs);
	System.out.println("查找的idnex="+ index);
	
	}
	}
class A02{
	public int find(String findStr,String[] strs) {
		for(int i = 1;i<strs.length;i++){
			if(findStr.equals(strs[i])) {
				return i;
			}
			
		}
	return -1;
	}
			
		}