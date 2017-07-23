package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-23.
 */
public class DualMain {
}

class AAA {
    int aaa;

    public AAA(int aaa) {
        this.aaa = aaa;
    }

    public static void main(String[] args) {
        AAA ins1 = new AAA(10);
        BBB ins2 = new BBB(20);

        System.out.println("ins1.aaa=" + ins1.aaa);
        System.out.println("ins2.bbb=" + ins2.bbb);
    }
}

class BBB {
    int bbb;

    public BBB(int bbb) {
        this.bbb = bbb;
    }

    public static void main(String[] args) {
        AAA ins1 = new AAA(11);
        BBB ins2 = new BBB(22);

        System.out.println("ins1.aaa=" + ins1.aaa);
        System.out.println("ins2.bbb=" + ins2.bbb);
    }
}

