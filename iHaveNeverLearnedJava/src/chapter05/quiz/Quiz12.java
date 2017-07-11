package chapter05.quiz;

/**
 * Created by kimseunghyun on 2017-07-10.
 */
public class Quiz12 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        int sum = 0;

        while (true) {
            if (num % 2 == 1 || num % 3 == 0) {
                sum += num;
                count++;
            }
            if (sum > 1000) {
                System.out.println(sum);
                System.out.println(count);
                break;
            }
            num++;
        }
    }
}
