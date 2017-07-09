package chapter04.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class PostfixOp {
    public static void main(String[] args) {
        int num1=7;
        int num2, num3;

        num2 = num1++;  //num1이 8이 되긴 하는데...
        num3 = num1--;  //num1이 다시 7이 되긴 하는데..

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
