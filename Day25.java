import java.util.*;

public class Day25{
   public static void main(String[] args){
      List<String> list = new ArrayList<String>();
      list.add("vellore "); 
      list.add("institute "); 
      list.add("of ");
      list.add("technology ");
      list.add("Bhopal.");
      String[] s1 = list.toArray(new String[0]); 
      
      for(int i = 0; i< s1.length; ++i) {
         String contents = s1[i];
         System.out.print(contents);
      } 
   }
}