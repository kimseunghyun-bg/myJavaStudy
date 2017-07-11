package chapter06.quiz;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class Quiz02 {
    public static void main(String[] args) {
        abs(-10,-20);
    }

    private static void abs(int num1, int num2) {
        int abs;
        abs = num1 > num2 ? num1 - num2 : num2 - num1;
        abs = abs > 0 ? abs : -abs;
        System.out.println("절댓값 : " + abs);
    }
}
