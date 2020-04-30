package work6.task4;

import java.util.HashSet;
import java.util.Set;

public class RemoveEvenLenght {
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> arrayТames = new HashSet<>();
        for (String name : set) {
            if (name.length() % 2 != 0) {
                arrayТames.add(name);
            }
        }
        return arrayТames;
    }
}