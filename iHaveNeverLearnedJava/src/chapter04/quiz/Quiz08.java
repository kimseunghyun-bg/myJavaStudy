package chapter04.quiz;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class Quiz08 {
    public static void main(String[] args) {
        int num = 7;
        int bitset = 1 << 30;

        num |= bitset;
        System.out.println(num);
        System.out.println(num <<= 1);

        num = -12;
        bitset = ~0;
        bitset ^= (1 << 30);
        num &= bitset;
        System.out.println(num);
        System.out.println(num <<= 1);
    }
}
