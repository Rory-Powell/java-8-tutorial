package backup.generics;

import demo.generics.List;

public class Demo
{
   public static void main(String[] args)
   {
      List<String> ls = List.nil(); // Ok in JDK 7/8
      List.cons(42, List.nil()); // Ok in JDK 8
   }
}
