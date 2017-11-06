package chpater21.practice;

/**
 * Created by kimseunghyun on 2017-11-07.
 */

class AAA2 {
    @Override
    public String toString() {
        return "Class AAA2";
    }
}

class BBB2 {
    @Override
    public String toString() {
        return "Class BBB2";
    }
}

class InstanceTypeShower2 {
    public <T, U> void showInstType(T inst1, U inst2) {
        System.out.println(inst1);
        System.out.println(inst2);
    }
}

public class IntroGenericMethod2 {
    public static void main(String[] args) {
        AAA2 aaa = new AAA2();
        BBB2 bbb = new BBB2();

        InstanceTypeShower2 shower = new InstanceTypeShower2();
        shower.showInstType(aaa, bbb);
    }
}
