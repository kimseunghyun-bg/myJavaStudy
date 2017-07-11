package chapter05.practice;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class BreakPoint {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("[" + i + ", " + j + "]");
                if (i % 2 == 0 && j % 2 == 0) {
                    break;
                }
            }
        }
    }
}
