public class DNA{
  // DNA Sequencing
  public static void main(String[] args){
 String dna1 = "ATGCGATACGCTTGA";
String dna2 = "ATGCGATACGTGA";
String dna3 = "ATTAATATGTACTGA";
String dna = dna3;
int length = dna.length();
int start = dna.indexOf("ATG");
int stop = dna.indexOf("TGA");
if (start != -1 &&
    stop != -1 &&
    (stop - start) % 3 == 0) {
 
  String protein = dna.substring(start, stop+3); 
  System.out.println("Protein: " + protein);
 
}else { 
  System.out.println("No protein.");
}

 //System.out.println("length: "+ length);
//System.out.println(dna.concat(dna2));
//System.out.println(dna.equals(dna2));
//System.out.println("start: " + start);
//System.out.println("stop: " + stop);
//System.out.println(dna.charAt(3));
//System.out.println(dna.substring(0,3));
//System.out.println(dna.toLowerCase());//



}
}