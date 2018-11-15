import java.security.Key;
import java.util.*;

public class TaskMethod {

    public static Integer whichNumAppearsMostTimes(List<Integer> list) {
        Map<Integer, Integer> map1 = new HashMap<>();
        if (list == null) {
            throw new NoSuchElementException();
        } else {
            for (Integer number : list) {
                map1.put(number, Collections.frequency(list, number));
            }
        }
        Set<Map.Entry<Integer, Integer>> set = map1.entrySet();
        System.out.println(set.toString());
        Integer key = Collections.max(set, Map.Entry.comparingByValue()).getKey();
        return key;
    }
}
