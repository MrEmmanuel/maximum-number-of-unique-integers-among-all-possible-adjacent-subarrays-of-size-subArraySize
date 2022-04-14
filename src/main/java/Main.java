import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Collections max = new Collections();

        System.out.println(max.maxUniqueIntegers(10, 3, new ArrayDeque<>(Arrays.asList(7, 5, 5, 7, 5, 5, 7, 5, 5, 6))));

    }
}
