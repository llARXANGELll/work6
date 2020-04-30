package work6.task4;

import java.util.HashSet;
import java.util.Set;

public class RemoveEvenLenght {
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> result = new HashSet<>();
        for (String v : set) {
            if (v.length()%2 != 0) {
                result.add(v);
            }
        }
        return result;
    }
}