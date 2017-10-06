package chapter12.practice;

import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-10-06.
 */
public class ScanningMethods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은? ");
        String str = keyboard.nextLine();
        System.out.println("안녕하세요 " + str + '님');

        System.out.print("당신은 스파게티를 좋아한다는데, 진실입니까? ");
        boolean inTrue = keyboard.nextBoolean();
        if (inTrue == true) {
            System.out.printf("오~ 좋아하는군요.");
        } else {
            System.out.printf("이런 아니었군요.");
        }

        System.out.print("당신과 동생의 키는 어떻게 되나요?");
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double diff = num1 - num2;
        if (diff > 0) {
            System.out.println("당신이 " + diff + "만큼 크군요.");
        } else {
            System.out.println("당신이 " + (-diff) + "만큼 작군요.");
        }
    }
}
