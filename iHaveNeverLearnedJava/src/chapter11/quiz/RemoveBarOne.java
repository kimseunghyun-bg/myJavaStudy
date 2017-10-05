package chapter11.quiz;

/**
 * Created by kimseunghyun on 2017-10-05.
 */
public class RemoveBarOne {
    public static void main(String[] args) {
        String str = "990208-1012752";

        StringBuilder sb = new StringBuilder(str);

        int idx = sb.indexOf("-");
        if (idx != -1) {
            sb.deleteCharAt(idx);
        }

        System.out.println(sb);
    }
}
