package chpater20.practice;

import java.math.BigDecimal;

/**
 * Created by kimseunghyun on 2017-11-05.
 */
public class WowDoubleError {
    public static void main(String[] args) {
        BigDecimal e1 = new BigDecimal(1.6);
        BigDecimal e2 = new BigDecimal(0.1);

        System.out.println("두 실수의 덧셈결과 : " + e1.add(e2));
        System.out.println("두 실수의 곱셈결과 : " + e1.multiply(e2));
    }
}
