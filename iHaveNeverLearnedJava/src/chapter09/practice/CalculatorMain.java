package chapter09.practice;

/**
 * Created by kimseunghyun on 2017-07-16.
 */
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("1+2=" + cal.addTwoNumber(1, 2));
        System.out.println("2+4=" + cal.addTwoNumber(2, 4));
        System.out.println("5-1=" + cal.subTwoNumber(5, 1));
        cal.showOperatingTimes();
    }
}
