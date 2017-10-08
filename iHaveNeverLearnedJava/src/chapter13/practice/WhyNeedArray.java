package chapter13.practice;

import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-10-07.
 */
public class WhyNeedArray {
    public static void main(String[] args) {
        int fstHighScroe = 0;
        int sndHighScroe = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int score1 = scanner.nextInt();

        if (score1 >= fstHighScroe) {
            sndHighScroe = fstHighScroe;
            fstHighScroe = score1;
        } else if (score1 < fstHighScroe && score1 > sndHighScroe) {
            sndHighScroe = score1;
        }

        System.out.print("점수 입력 : ");
        int score2 = scanner.nextInt();

        if (score2 >= fstHighScroe) {
            sndHighScroe = fstHighScroe;
            fstHighScroe = score2;
        } else if (score2 < fstHighScroe && score2 > sndHighScroe) {
            sndHighScroe = score2;
        }

        System.out.print("점수 입력 : ");
        int score3 = scanner.nextInt();

        if (score3 >= fstHighScroe) {
            sndHighScroe = fstHighScroe;
            fstHighScroe = score3;
        } else if (score3 < fstHighScroe && score3 > sndHighScroe) {
            sndHighScroe = score3;
        }

        System.out.printf("A 학점은 %d점 이상입니다. \n", sndHighScroe);
    }
}
