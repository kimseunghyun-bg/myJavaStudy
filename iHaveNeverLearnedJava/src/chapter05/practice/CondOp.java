package chapter05.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class CondOp {
    public static void main(String[] args) {
        int num1 = 50, num2 = 100;
        int big, diff;

        big = (num1 > num2) ? num1 : num2;
        System.out.println(big);

        diff = (num1 > num2) ? num1 - num2 : num2 - num1;
        System.out.println(diff);
    }
}
