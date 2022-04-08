import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Test {
    public static int solution (String n, int b) {
        int k = n.length(); //length of arr
        ArrayList<Integer> z = new ArrayList<>(); //z = x - y
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();

        for(int i = 0; i < n.length(); i++) {
            int j = Character.digit(n.charAt(i), b);
            y.add(j);
            x.add(j);
        }
        Collections.sort(y);
        Collections.sort(x);
        Collections.reverse(x);
        int sum = 0;
        for(int c = 0; c < k; c++) {
            z.add();
        }

        System.out.println("z:" + z);
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        return b;
    }

    public static void main(String[] args) {
        System.out.println("test 1");
        System.out.println(solution("210022", 3));
        System.out.println("test 2");
        System.out.println(solution("1211", 10));

        String str = "210022";


    }

}
