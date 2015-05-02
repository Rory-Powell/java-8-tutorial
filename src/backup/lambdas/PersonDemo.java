package backup.lambdas;

import demo.lambdas.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonDemo
{

   public static void main(String[] args)
   {
      // Setup
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Mark", 26));
      persons.add(new Person("Ken", 64));
      persons.add(new Person("Roy", 8));

      // Without Lambda
      Collections.sort(persons, new Comparator<Person>() {
         public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
         }
      });
      Person.printList(persons);

      // With Lambda
      Collections.sort(persons, (p1, p2) -> p1.getAge().compareTo(p2.getAge()));
      Person.printList(persons);
   }
}
