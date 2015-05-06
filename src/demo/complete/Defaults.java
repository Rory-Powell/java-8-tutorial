package demo.complete;

import java.util.ArrayList;
import java.util.List;

public class Defaults
{
   public static void main(String[] args)
   {
      List<String> list = new ArrayList<>();
      list.add("One");
      list.add("Two");
      list.add("Three");

      // Without lambda
      for (String s : list)
      {
         if (s.equals("One"))
            list.remove(s);
      }

      // With lambda
      list.removeIf(s -> s.equals("One"));

      // Without lambda
      List<String> list2 = new ArrayList<>();
      for (String s : list)
      {
         list2.add(s.toUpperCase());
      }

      // With lambda
      list.replaceAll(String::toUpperCase);

      printList(list);
   }

   public static void printList(List<String> list)
   {
      for(String s : list)
      {
         System.out.println(s);
      }
   }

}
