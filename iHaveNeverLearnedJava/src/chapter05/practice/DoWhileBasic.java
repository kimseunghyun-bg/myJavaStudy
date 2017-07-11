package chapter05.practice;

/**
 * Created by kimseunghyun on 2017-07-10.
 */
public class DoWhileBasic {
    public static void main(String[] args) {
        int num = 0;

        do {
            System.out.println("I like Java : " + num);
            num++;
        } while (num < 5);
    }
}
