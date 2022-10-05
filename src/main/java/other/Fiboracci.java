package other;

import org.junit.Test;

public class Fiboracci {

    public static long loop(int n) {
        long first = 1;
        long second = 1;
        if (n <= 0) {
            throw new IllegalArgumentException("值不能小于零");
        } else if (2 == n) {
            return first;
        } else if (1 == n) {
            return second;
        }

        for (int i = 0; i < n - 2; i++) {
            second += first;
            first = second - first;
        }

        return second;
    }

    public static long recursion(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("值不能小于零");
        } else if (n == 1 || n == 2) {
            return 1;
        }

        return recursion(n - 1) + recursion(n - 2);
    }

    @Test
    public void test(){
        System.out.println(loop(10));
        System.out.println(recursion(10));
    }

}
