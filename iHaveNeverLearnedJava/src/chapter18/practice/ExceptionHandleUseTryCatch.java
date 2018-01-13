package chpater18.practice;

import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
public class ExceptionHandleUseTryCatch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("피제수 입력 : ");
                int num1 = keyboard.nextInt();

                System.out.print("제수 입력 : ");
                int num2 = keyboard.nextInt();

                System.out.print("연산결과를 저장할 배열의 인덱스 입력 : ");
                int idx = keyboard.nextInt();

                arr[idx] = num1 / num2;
                System.out.println("나눗셈 결과는 " + arr[idx]);
                System.out.println("저장된 위치의 인덱스는 " + idx);
            } catch (ArithmeticException e) {
                System.out.println("제수는 0이 될 수 없습니다.");
                i--;
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("유효하지 않은 인덱스 값입니다.");
                i--;
                continue;
            }
        }
    }
}
