import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Sneaker Pimps - Six Underground");
    desertIslandPlaylist.add("lalala");
    desertIslandPlaylist.add("b");
   desertIslandPlaylist.add("salala");
   desertIslandPlaylist.add("dongdongqiang");
   desertIslandPlaylist.add("huluwa");
desertIslandPlaylist.remove("huluwa");

 int indexA = desertIslandPlaylist.indexOf("lalala");
int indexB = desertIslandPlaylist.indexOf("b");
String tempA = "a";
desertIslandPlaylist.set(indexA,tempA);
desertIslandPlaylist.set(indexB,"dengdengdeng");
    System.out.println(desertIslandPlaylist);
 // System.out.println(desertIslandPlaylist.size());//


  }
  
}