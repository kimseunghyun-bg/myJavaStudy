package chapter05.quiz;

/**
 * Created by kimseunghyun on 2017-07-10.
 */
public class Quiz11 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 1; num < 100; num++) {
            if (num % 5 != 0 || num % 7 != 0) {
                continue;
            }
            count++;
            System.out.println(num);
        }
        System.out.println("count : " + count);
    }
}
