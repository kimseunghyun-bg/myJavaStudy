package chapter05.practice;

/**
 * Created by kimseunghyun on 2017-07-10.
 */
public class InfLoop {
    public static void main(String[] args) {
        int num = 1;

        while (true) {
            if (num % 6 == 0 && num % 14 == 0) {
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
