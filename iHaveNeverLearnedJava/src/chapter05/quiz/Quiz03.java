package chapter05.quiz;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class Quiz03 {
    public static void main(String[] args) {
        int num1 = 50, num2 = 100;
        int big, diff;

        if (num1 > num2) {
            big = num1;
        } else {
            big = num2;
        }
        System.out.println(big);

        if (num1 > num2) {
            diff = num1 - num2;
        } else {
            diff = num2 - num1;
        }
        System.out.println(diff);
    }
}
