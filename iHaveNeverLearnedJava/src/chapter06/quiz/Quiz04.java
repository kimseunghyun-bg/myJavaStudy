package chapter06.quiz;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class Quiz04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int num) {
        int flag = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                flag++;
            }
        }
        if (flag == 2) {
            return true;
        }
        return false;
    }
}
