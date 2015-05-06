package demo.complete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Person
{
   public static void main(String[] args)
   {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Chris Wallace", 35, Gender.MALE));
      persons.add(new Person("Nick Savage", 7, Gender.MALE));
      persons.add(new Person("Ken Murphy", 67, Gender.MALE));

      // Without lambda
      Collections.sort(persons, new Comparator<Person>() {
         @Override
         public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
         }
      });
      printList(persons);

      // With lambda
      persons.sort(comparing(Person::getAge));
      printList(persons);
   }

   public Person(String first, String last, int age, Gender gender)
   {
      m_first = first;
      m_last = last;
      m_age = age;
      m_gender = gender;
   }

   public Person(String name, int age, Gender gender)
   {
      this(name.split(" ")[0], name.split(" ")[1], age, gender);
   }

   // Getters
   public String getFirst()
   {
      return m_first;
   }
   public String getLast()
   {
      return m_last;
   }

   public Integer getAge()
   {
      return m_age;
   }

   public Gender getGender()
   {
      return m_gender;
   }

   @Override
   public String toString()
   {
      return "Person: " + m_first + " " + m_last + " " + m_age + " year old " + m_gender.toString().toLowerCase();
   }

   public static void printList(List<Person> persons)
   {
      System.out.println("-------------------");
      for (Person p : persons)
          System.out.println(p.toString());
   }

   public enum Gender
   {
      MALE(), FEMALE()
   }

   private String m_first;
   private String m_last;
   private int m_age;
   private Gender m_gender;
}

