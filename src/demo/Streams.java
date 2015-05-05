package demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Comparator.comparing;

import demo.Person.Gender;

public class Streams
{
   public static void main(String[] args)
   {
      List<Person> persons = populateList();

//      // Filter the list
//      List<Person> over30 = new ArrayList<>();
//      for (Person p : persons)
//      {
//         if (p.getAge() > 30)
//            over30.add(p);
//      }
//
//      // Sort the list
//      Collections.sort(over30, new Comparator<Person>() {
//         @Override
//         public int compare(Person o1, Person o2) {
//            return o1.getAge().compareTo(o2.getAge());
//         }
//      });
//
//      // extract first names
//      List<String> firstNames = new ArrayList<>();
//      for (Person p : over30)
//      {
//         firstNames.add(p.getFirst());
//      }
//
//      // print them
//      for(String s : firstNames)
//         System.out.println(s);

      List<String> strings = persons.stream()
              .parallel()
              .filter(p -> p.getAge() > 30)
              .sequential()
              .limit(3)
              .sorted(comparing(Person::getAge))
              .map(Person::getFirst)
              .collect(Collectors.toList());

      strings.forEach(System.out::println);
   }

   public static List<Person> populateList()
   {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Ken Murphy", 26, Gender.MALE));
      persons.add(new Person("Phil McIlvenna", 39, Gender.MALE));
      persons.add(new Person("Kay Gemmert", 19, Gender.FEMALE));
      persons.add(new Person("Saravanan Selvaraj", 43, Gender.MALE));
      persons.add(new Person("Matthew Hathaway", 8, Gender.MALE));
      persons.add(new Person("Kamil Przerwa", 42, Gender.MALE));
      persons.add(new Person("Roy Robinson", 58, Gender.MALE));
      persons.add(new Person("Martin Samm", 21, Gender.MALE));
      persons.add(new Person("Maria Dobrska", 26, Gender.FEMALE));
      persons.add(new Person("Nick Savage", 64, Gender.MALE));
      persons.add(new Person("Chris Wallace", 42, Gender.MALE));
      persons.add(new Person("Andrew Wallace", 16, Gender.MALE));
      persons.add(new Person("Ryan Williams", 22, Gender.MALE));

      return persons;
   }

}
