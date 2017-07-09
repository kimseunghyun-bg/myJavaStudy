package chapter04.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class BitShiftOp {
    public static void main(String[] args) {
        System.out.println(2 << 1);     // 4 출력
        System.out.println(2 << 2);     // 8 출력
        System.out.println(2 << 3);     // 16 출력

        System.out.println(8 >> 1);     // 4 출력
        System.out.println(8 >> 2);     // 2 출력
        System.out.println(8 >> 3);     // 1 출력

        System.out.println(-8 >> 1);    // -4 출력
        System.out.println(-8 >> 2);    // -2 출력
        System.out.println(-8 >> 3);    // -1 출력

        System.out.println(-8 >>> 1);   // 2147483644 출력
    }
}
