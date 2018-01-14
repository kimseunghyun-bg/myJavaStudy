package chapter21.practice;

/**
 * Created by kimseunghyun on 2017-11-07.
 */

interface SimpleInterface1 {
    void showYourName();
}

class UpperClass1 {
    public void showYourAncestor() {
        System.out.println("UpperClass1");
    }
}

class AAA3 extends UpperClass1 implements SimpleInterface1 {
    @Override
    public void showYourName() {
        System.out.println("Class AAA3");
    }
}

class BBB3 extends UpperClass1 implements SimpleInterface1 {
    @Override
    public void showYourName() {
        System.out.println("Class BBB3");
    }
}

public class BoundedTypeParam {
    public static <T> void showInstanceAncestor(T param) {
        ((SimpleInterface1)param).showYourName();
    }

    public static <T> void showInstanceName(T param) {
        ((UpperClass1)param).showYourAncestor();
    }

    public static void main(String[] args) {
        AAA3 aaa = new AAA3();
        BBB3 bbb = new BBB3();

        showInstanceAncestor(aaa);
        showInstanceName(aaa);
        showInstanceAncestor(bbb);
        showInstanceName(bbb);
    }
}
