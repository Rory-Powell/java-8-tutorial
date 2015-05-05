package demo;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethods
{
   public static void main(String[] args)
   {
      List<String> list = new ArrayList<>();
      list.add("one");
      list.add("two");
      list.add("three");

      list.removeIf(s -> s.equals("one"));
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
