import java.util.Arrays;

public class WarmUps {
    public static void main(String[] args) {
        //array warm up
        //=========================
        int[] arr = {2, 4, 8, 5, 1, 2};
        int sumOdd = 0;
        int sumEven = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                sumEven += j;
            } else {
                sumOdd += j;
            }
        }

        int[] newArr = {sumEven, sumOdd};
        System.out.println(Arrays.toString(newArr));
    }
}
