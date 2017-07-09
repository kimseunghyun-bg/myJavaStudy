package chapter05.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class IEUsage {
    public static void main(String[] args) {
        int num = 10;

        if (num > 10) {
            System.out.println("num은 0보다 크다.");
        }

        if ((num % 2) == 0) {
            System.out.println("num은 짝수");
        } else {
            System.out.println("num은 홀수");
        }
    }
}
