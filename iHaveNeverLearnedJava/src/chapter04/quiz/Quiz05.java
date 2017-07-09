package chapter04.quiz;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class Quiz05 {
    public static void main(String[] args) {
        int A = ((25 + 5) + (36 / 4) - 72) * 5;
        int B = ((25 * 5) + (36 - 4) + 71) / 4;
        int C = (128 / 4) * 2;

        if ((A > B) && (B > C)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
