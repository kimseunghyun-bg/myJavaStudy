package chapter05.quiz;

/**
 * Created by kimseunghyun on 2017-07-09.
 */
public class Quiz02 {
    public static void main(String[] args) {
        int num = 120;

        if (num < 0) {
            System.out.println("0 미만");
        } else if (num < 100) {
            System.out.println("0 이상 100 미만");
        } else if (num < 200) {
            System.out.println("100 이상 200 미만");
        } else if (num < 300) {
            System.out.println("200 이상 300 미만");
        } else {
            System.out.println("300 이상");
        }
    }
}
