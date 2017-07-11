package chapter06.practice;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class RightRecur {
    public static void main(String[] args) {
        showHi(3);
    }

    private static void showHi(int cnt) {
        System.out.println("HI~ ");
        if (cnt == 1) {
            return;
        }
        showHi(--cnt);
    }
}
