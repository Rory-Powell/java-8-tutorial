package demo;

import java.util.ArrayList;
import java.util.List;

public class Defaults
{
   public static void main(String[] args)
   {

   }

   public static void printList(List<String> list)
   {
      // Without lambda
      for(String s : list)
      {
         System.out.println(s);
      }
   }

}
