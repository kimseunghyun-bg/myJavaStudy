package chpater18.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
public class FinallyTest {
    public static void main(String[] args) {
        boolean divOK = divider(4, 2);
        if (divOK) {
            System.out.println("연산 성공");
        } else {
            System.out.println("연산 실패");
        }

        divOK = divider(4, 0);
        if (divOK) {
            System.out.println("연산 성공");
        } else {
            System.out.println("연산 실패");
        }
    }

    public static boolean divider(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("나눗셈 결과는 " + result);
            return true;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("finally 영역 실행");
        }
    }
}
