package work6.task1;

public class Person {

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("[%d, %s]", age, name);
    }
}
