package work6.task1;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;


class CompTest {

    @Test
    public void compTest(){
        List personList = Arrays.asList(
                new Person(22, "Ivan"),
                new Person(12,"Iran"),
                new Person(53,"Vova"),
                new Person(22,"Ivan")
        );
        System.out.println(personList);

        personList.sort(new PersonSuperComparator());
        System.out.println(personList);
    }
}
