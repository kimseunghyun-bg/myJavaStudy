package chapter06.quiz;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class Quiz05 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(10));
    }

    private static int powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2*powerOfTwo(n-1);
        }
    }
}
