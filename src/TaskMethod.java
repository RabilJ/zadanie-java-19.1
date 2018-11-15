import java.util.*;

public class TaskMethod {

    public static int whichNumAppearsMostTimes(List<Integer> list) {
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
            int maxValueInMap = Collections.max(map1.values());
            int bestKey = 0;
            List<Integer>list1 = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : set) {
                if (entry.getValue() == maxValueInMap)
                    list1.add(entry.getKey());
            }
            bestKey = Collections.min(list1);

        return bestKey;
    }
}