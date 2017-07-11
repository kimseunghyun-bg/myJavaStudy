package chapter06.practice;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class RecurFactorial {
    public static void main(String[] args) {
        System.out.println("3 factorial : " + factorial(3));
        System.out.println("12 factorial : " + factorial(12));
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num*factorial(num-1);
        }
    }
}
