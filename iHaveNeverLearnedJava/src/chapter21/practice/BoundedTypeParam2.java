package chapter21.practice;

/**
 * Created by kimseunghyun on 2017-11-07.
 */

interface SimpleInterface2 {
    void showYourName();
}

class UpperClass2 {
    public void showYourAncestor() {
        System.out.println("UpperClass2");
    }
}

class AAA4 extends UpperClass2 implements SimpleInterface2 {
    @Override
    public void showYourName() {
        System.out.println("Class AAA4");
    }
}

class BBB4 extends UpperClass2 implements SimpleInterface2 {
    @Override
    public void showYourName() {
        System.out.println("Class BBB4");
    }
}

public class BoundedTypeParam2 {
    public static <T extends SimpleInterface2> void showInstanceAncestor(T param) {
        param.showYourName();
    }

    public static <T extends UpperClass2> void showInstanceName(T param) {
        param.showYourAncestor();
    }

    public static void main(String[] args) {
        AAA4 aaa = new AAA4();
        BBB4 bbb = new BBB4();

        showInstanceAncestor(aaa);
        showInstanceName(aaa);
        showInstanceAncestor(bbb);
        showInstanceName(bbb);
    }
}
