package chapter04.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class BitOperator {
    public static void main(String[] args) {
        int num1 = 5;     // 00000000 00000000 00000000 00000101
        int num2 = 3;     // 00000000 00000000 00000000 00000011
        int num3 = -1;    // 11111111 11111111 11111111 11111111

        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num3);
    }
}
