import java.util.*;

public class Collections {

    Deque<Integer> deque = new ArrayDeque<>();
    HashSet<Integer> setOfInt = new HashSet<>();

    public int maxUniqueIntegers(int intNumber, int subArraySize, Deque<Integer> integerDeque) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intNumber; i++) {
            int input = integerDeque.pop();

            deque.add(input);
            setOfInt.add(input);

            if (deque.size() == subArraySize) {
                if (setOfInt.size() > max) max = setOfInt.size();
                int first = deque.remove();
                if (!deque.contains(first)) setOfInt.remove(first);
            }
        }
        return max;
    }
}
