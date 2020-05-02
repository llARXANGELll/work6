package work6.task1;


import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        if ((o1).getAge() > (o2).getAge()) {
            return 1;
        } else if ((o1).getAge() < (o2).getAge()) {
            return -1;
        }

        return (o1).getName().compareTo((o2).getName());
    }
}