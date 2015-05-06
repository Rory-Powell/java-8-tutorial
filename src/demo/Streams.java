package demo;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;

import demo.Person.Gender;

public class Streams
{
   public static void main(String[] args)
   {

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
      persons.add(new Person("Maria Dobrska", 42, Gender.FEMALE));
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
