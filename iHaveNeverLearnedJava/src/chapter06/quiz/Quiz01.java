package chapter06.quiz;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class Quiz01 {
    public static void main(String[] args) {
        simpleOpr(10, 20);
    }

    private static void simpleOpr(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + "\n나머지 : " + (num1 % num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
}
