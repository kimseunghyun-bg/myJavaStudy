package chapter05.quiz;

/**
 * Created by kimseunghyun on 2017-07-10.
 */
public class Quiz06 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num < 100) {
            sum += num;
            num++;
        }

        System.out.println(sum);
    }
}
