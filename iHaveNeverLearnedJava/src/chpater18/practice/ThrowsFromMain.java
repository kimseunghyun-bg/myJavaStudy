package chpater18.practice;

import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-10-09.
 */

class AgeInputException2 extends Exception {
    public AgeInputException2() {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}

public class ThrowsFromMain {
    public static void main(String[] args) throws AgeInputException2 {
        System.out.print("나이를 입력하세요 : ");
        int age = readAge();
        System.out.println("당신은 " + age + "세입니다.");
    }

    public static int readAge() throws AgeInputException2 {
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        if (age < 0) {
            throw new AgeInputException2();
        }
        return age;
    }
}
