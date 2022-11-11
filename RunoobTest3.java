import java.io.*;
public class RunoobTest3{
	public static void main(String[] args) {
		BufferedReader br = null;
		String line;
		try {
			System.out.println("Entering try block");
			br = new BufferedReader(new FileReader("text.txt"));
			while ((line = br.readLine()) != null) {
	            System.out.println("Line =>"+line);
	            }
		 
    } catch (IOException e) {
        System.out.println("IOException in try block =>" + e.getMessage());
    } finally {
        System.out.println("Entering finally block");
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            System.out.println("IOException in finally block =>"+e.getMessage());
        }
    }

}
		
	}

