package chpater21.practice;

/**
 * Created by kimseunghyun on 2017-11-07.
 */

class AAA1 {
    @Override
    public String toString() {
        return "Class AAA1";
    }
}

class BBB1 {
    @Override
    public String toString() {
        return "Class BBB1";
    }
}

class InstanceTypeShower1 {
    int showCnt = 0;

    public <T> void showInstType(T inst) {
        System.out.println(inst);
        showCnt++;
    }

    void showPrintCnt() {
        System.out.println("Show count : " + showCnt);
    }
}

public class IntroGenericMethod1 {
    public static void main(String[] args) {
        AAA1 aaa = new AAA1();
        BBB1 bbb = new BBB1();

        InstanceTypeShower1 shower = new InstanceTypeShower1();
        shower.showInstType(aaa);
        shower.showInstType(bbb);
        shower.showPrintCnt();

    }

}
