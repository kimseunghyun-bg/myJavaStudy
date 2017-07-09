package chapter04.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class PrefixOp {
    public static void main(String[] args) {
        int num1 = 7;
        int num2, num3;

        num2 = ++num1;  //num1은 8이 됨
        num3 = --num1;  //num1은 다시 7이 됨

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
