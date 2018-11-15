import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class TaskTest {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6);
        try {
            System.out.println(TaskMethod.whichNumAppearsMostTimes(list));
        } catch (NoSuchElementException ex) {
            System.out.println("Twoja lista jest pusta");
        }
    }
}