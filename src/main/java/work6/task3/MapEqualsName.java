package work6.task3;


import java.util.ArrayList;
import java.util.Map;

public class MapEqualsName {

    public boolean isUnique(Map<String, String> map) {
        ArrayList<String> dublicate = new ArrayList<>();
        for (String k : map.values()){
            if(dublicate.contains(k)){
                return false;
            }
            dublicate.add(k);
        }
        return true;
    }
}