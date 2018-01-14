package chapter20.practice;

import java.util.Random;

/**
 * Created by kimseunghyun on 2017-11-05.
 */
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();

        for(int i = 0; i<100; i++) {
            System.out.println(rand.nextInt(1000));
        }
    }
}
