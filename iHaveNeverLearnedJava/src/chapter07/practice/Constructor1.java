package chapter07.practice;

/**
 * Created by kimseunghyun on 2017-07-15.
 */

class Number1 {
    int num;

    public Number1() {
        num = 10;
        System.out.println("생성자 호출!");
    }
    public int getNumber() {
        return num;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Number1 num1 = new Number1();
        System.out.println(num1.getNumber());

        Number1 num2 = new Number1();
        System.out.println(num2.getNumber());
    }
}
