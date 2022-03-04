import java.util.*;

public class Collections {

     int count = 0;
     HashSet<Integer> set = new HashSet<>();
     Deque<Object> queue = new ArrayDeque<>();

    public int maxUniqueIntegers(int intNumber, int subArraySize, int[] array) {
        for (int i = 0; i < intNumber; i++){
            queue.add(array[i]);
        }
        for (int i = 0; i < intNumber - subArraySize; i++) {
            Object[] temp = queue.toArray();
            for (int j = 0; j < subArraySize; j++) {
                set.add((int)temp[j]);
            }
            queue.remove();
            if (set.size() > count) count = set.size();
            set.clear();
        }
        return count;
    }
}
