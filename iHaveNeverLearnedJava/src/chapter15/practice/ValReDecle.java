package chapter15.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class AAA2 {
    public int num = 2;
}

class BBB2 extends AAA2 {
    public int num = 5;
}

class CCC2 extends BBB2 {
    public int num = 7;
}

public class ValReDecle {
    public static void main(String[] args) {
        CCC2 ref1 = new CCC2();
        BBB2 ref2 = ref1;
        AAA2 ref3 = ref2;

        System.out.println("CCC2's ref : "+ ref1.num);
        System.out.println("BBB2's ref : "+ ref2.num);
        System.out.println("AAA2's ref : "+ ref3.num);
    }
}
