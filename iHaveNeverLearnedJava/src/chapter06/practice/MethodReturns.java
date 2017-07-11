package chapter06.practice;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class MethodReturns {
    public static void main(String[] args) {
        int result = adder(4, 5);
        System.out.println("4와 5의 합 : " + result);
        System.out.println("3.5의 제곱 : " + square(3.5));
    }

    private static int adder(int num1, int num2) {
        int addResult = num1 + num2;
        return addResult;
    }

    private static double square(double num) {
        return num * num;
    }
}
