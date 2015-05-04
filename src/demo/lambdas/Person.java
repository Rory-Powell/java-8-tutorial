package demo.lambdas;

import java.util.*;

public class Person
{
   public static void main(String[] args)
   {
      List<Person> people = new ArrayList<>();
      people.add(new Person("Ken Murphy", 26, Gender.MALE));
      people.add(new Person("Phil McIlvenna", 39, Gender.MALE));
      people.add(new Person("Kay Gemmert", 19, Gender.FEMALE));
      people.add(new Person("Saravanan Selvaraj", 43, Gender.MALE));
      people.add(new Person("Matthew Hathaway", 8, Gender.MALE));
      people.add(new Person("Kamil Przerwa", 42, Gender.MALE));
      people.add(new Person("Roy Robinson", 58, Gender.MALE));
      people.add(new Person("Martin Samm", 21, Gender.MALE));
      people.add(new Person("Maria Dobrska", 26, Gender.FEMALE));
      people.add(new Person("Nick Savage", 64, Gender.MALE));
      people.add(new Person("Chris Wallace", 42, Gender.MALE));
      people.add(new Person("Andrew Wallace", 16, Gender.MALE));
      people.add(new Person("Ryan Williams", 22, Gender.MALE));

      Collections.sort(people, new Comparator<Person>() {
         @Override
         public int compare(Person o1, Person o2) {
            return o1.getFirst().compareTo(o2.getFirst());
         }
      });
      printList(people);

      Collections.sort(people, (o1, o2) -> o1.getAge().compareTo(o2.getAge()));
      printList(people);

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
   public String getFirst() { return m_first; }
   public String getLast() { return m_last;}
   public Integer getAge() { return m_age; }
   public Gender getGender() { return m_gender; }

   @Override
   public String toString() { return "Name: " + this.getFirst() + ", " + "Age: " + this.getAge(); }

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

