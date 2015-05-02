package resources.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1
{
   public static void main(String[] args)
   {
      /** List contains unknown type */
//      List<?> numbers = new ArrayList<>(); // No type

      /** List contains subclass of Number */
//      List<? extends Number> numbers = new ArrayList<>(); // Extends

      /** List contains super class of Number */
//      List<? super Number> numbers = new ArrayList<>(); // Super

      /** List contains Numbers */
      List<Number> numbers = new ArrayList<>(); // Explicit

      // Write
      numbers.add(new Integer(4));

      // Read
      Number numericValue = numbers.get(0);

      // Does not use types
      numbers.size();
   }
}
