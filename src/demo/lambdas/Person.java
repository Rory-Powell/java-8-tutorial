package demo.lambdas;

import java.util.*;

public class Person
{
   public static void main(String[] args)
   {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Ken", 67));
      persons.add(new Person("Roy", 7));

//      for (Person p : persons)
//         if (p.getName().equals("Roy"))
//            persons.remove(p);

      persons.removeIf(p -> p.getName().equals("Roy"));
      Person.printList(persons);

   }

   public String m_name;
   public int m_age;

   public Person(String name, int age)
   {
      m_name = name;
      m_age = age;
   }

   public String getName()
   {
      return m_name;
   }

   public Integer getAge()
   {
      return m_age;
   }

   @Override
   public String toString()
   {
      return "Name: " + this.getName() + ", " + "Age: " + this.getAge();
   }

   public static void printList(List<Person> persons)
   {
      System.out.println("-------------------");
      persons.forEach(p -> System.out.println(p.toString()));

   }
}

