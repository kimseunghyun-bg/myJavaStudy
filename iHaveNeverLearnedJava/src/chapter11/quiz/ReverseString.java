package chapter11.quiz;

/**
 * Created by kimseunghyun on 2017-10-05.
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMN";

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
