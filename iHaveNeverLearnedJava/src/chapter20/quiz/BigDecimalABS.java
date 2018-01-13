package chpater20.quiz;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-11-05.
 */
public class BigDecimalABS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("실수 1 입력 : ");
        BigDecimal e1 = scanner.nextBigDecimal();
        System.out.print("실수 2 입력 : ");
        BigDecimal e2 = scanner.nextBigDecimal();

        System.out.println(e1.subtract(e2).abs());
    }

}
