package work6.task4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("dsd");
        set.add("dsd1");
        set.add("dsd11");
        set.add("dsd2");
        set.add("dsd1");
        RemoveEvenLenght removeEvenLenght = new RemoveEvenLenght();
        System.out.println(removeEvenLenght.removeEvenLength(set));
    }
}