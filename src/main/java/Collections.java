import java.util.*;

public class Collections {

    Deque<Integer> deque = new ArrayDeque<>();

    public long maxUniqueIntegers(int intNumber, int subArraySize, Deque<Integer> integerDeque) {

        long max = 0;
        long countUnique;
        for (int i = 0; i < intNumber; i++) {
            int input = integerDeque.pop();
            deque.add(input);
            if (deque.size() == subArraySize) {
                countUnique = deque.stream().distinct().count();
                if(countUnique >= max){
                    max = countUnique;
                }
                deque.removeFirst();
            }
        }
        return max;
    }
}
