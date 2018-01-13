package chpater20.quiz;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-11-05.
 */
public class RandomBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min;
        int max;

        System.out.print("최대 정수 A를 입력 : ");
        max = scanner.nextInt();

        System.out.print("최소 정수 B를 입력 : ");
        min = scanner.nextInt();

        Random random = new Random();

        for(int i=0, val = 0; i<10; i ++){
            val = random.nextInt(max-min+1);
            val+=val+min;
            System.out.println(val);
        }

    }
}
