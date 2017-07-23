package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-23.
 */

class NumberPrinter {
    public static void showInt(int n) {
        System.out.println(n);
    }
    public static void showDouble(double n) {
        System.out.println(n);
    }
}

public class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);
        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);
    }
}
