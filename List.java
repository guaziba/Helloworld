import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> yellow = new ArrayList<String>();
  yellow.add("haha");
  yellow.add("lala");
  yellow.add("kaka");
  yellow.add("sasa");
    System.out.println(yellow.size());
    System.out.println(yellow.get(3));
    yellow.set(1,"papa");
    yellow.remove("kaka");
      System.out.println(yellow.indexOf("sasa"));
    


  }
  
}