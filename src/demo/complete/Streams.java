package demo.complete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import demo.complete.Person.Gender;

import static java.util.Comparator.comparing;

public class Streams
{
   public static void main(String[] args) {
      List<Person> persons = populateList();

      // Filter the list
      List<Person> over30 = new ArrayList<>();
      for (Person p : persons)
      {
         if (p.getAge() > 30)
            over30.add(p);
      }

      // Sort the list
      Collections.sort(over30, new Comparator<Person>() {
         @Override
         public int compare(Person o1, Person o2) {
            return o1.getFirst().compareTo(o2.getFirst());
         }
      });

      // extract first names
      List<String> firstNames = new ArrayList<>();
      for (Person p : over30)
      {
         firstNames.add(p.getFirst());
      }

      // print them
      for (String s : firstNames)
      {
         System.out.println(s);
      }


      // With lambda
      persons.stream()
              .parallel()
              .filter(p -> p.getAge() > 30)
              .limit(5)
              .sequential()
              .sorted(comparing(Person::getFirst))
              .map(Person::getFirst)
              .forEach(System.out::println);
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
      persons.add(new Person("Glenn Sayers", 29, Gender.MALE));
      persons.add(new Person("Amit Sharma", 32, Gender.MALE));
      persons.add(new Person("Conor Fleming", 54, Gender.MALE));
      persons.add(new Person("Ralph McTeggart", 6, Gender.MALE));
      persons.add(new Person("Chris Mayne", 22, Gender.MALE));
      persons.add(new Person("Mark McKillion", 84, Gender.MALE));

      return persons;
   }

}
