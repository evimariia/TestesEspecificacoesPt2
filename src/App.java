import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        left.add(2);

        right.add(5);
        right.add(6);
        right.add(4);

        System.out.println(left);
        System.out.println(right);
        System.out.println(NumberUtils.add(left, right));
    }

}
