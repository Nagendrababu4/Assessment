import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        Integer[] array = {11,12,13,14,15,16,17,18,19,20};
        
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        
        System.out.println("Shuffled Array: " + list);
    }
}