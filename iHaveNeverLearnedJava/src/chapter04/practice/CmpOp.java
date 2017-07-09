package chapter04.practice;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class CmpOp {
    public static void main(String[] args) {
        int A = 10, B = 20;

        if (true) {
            System.out.println("참 입니다!");
        } else {
            System.out.println("거짓 입니다.");
        }

        if (A > B) {
            System.out.println("A가 더 크다!");
        } else {
            System.out.println("A가 더 크지 않다!");
        }

        if (A != B) {
            System.out.println("A와 B는 다르다!");
        } else {
            System.out.println("A와 B는 같다!");
        }
    }
}
