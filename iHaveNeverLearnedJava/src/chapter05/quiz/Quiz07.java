package chapter05.quiz;

/**
 * Created by kimseunghyun on 2017-07-10.
 */
public class Quiz07 {
    public static void main(String[] args) {
        int num = 0;

        while (num < 100) {
            System.out.println(++num);
        }

        do {
            System.out.println(num--);
        } while (num > 0);
    }
}
