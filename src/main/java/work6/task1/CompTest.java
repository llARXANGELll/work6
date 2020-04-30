package work6.task1;

import java.util.Arrays;
import java.util.List;


public class CompTest {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person(22, "Ivan"),
                new Person(12, "Iran"),
                new Person(53, "Vova"),
                new Person(22, "Ivan")
        );
        System.out.println(personList);
        personList.sort(new PersonSuperComparator());
        System.out.println(personList);
    }
}