package chapter08.practice;

/**
 * Created by kimseunghyun on 2017-07-15.
 */

class AAA {
    public void printName() {
        System.out.println("AAA");
    }
}

class BBB {
    public void printName() {
        System.out.println("BBB");
    }
}

public class ClassPath {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.printName();

        BBB bbb = new BBB();
        bbb.printName();
    }
}
