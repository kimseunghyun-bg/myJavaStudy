package chapter04.quiz;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class Quiz04 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 6, num3 = 9, num4 = 12;
        int result;

        result = num1 + num2;
        System.out.println("3+6 : " + result);

        result += num3;
        System.out.println("3+6+9 : " + result);

        result += num4;
        System.out.println("3+6+9+12 : " + result);
    }
}
