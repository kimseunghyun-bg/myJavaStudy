package chapter17.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */

interface Readable3 {
    void read();
}

class OuterClass4 {
    private String myName;

    public OuterClass4(String myName) {
        this.myName = myName;
    }

    public Readable3 createLocalClassInst(int instID) {
        return new Readable3() {
            @Override
            public void read() {
                System.out.println("Outer inst name : " + myName);
                System.out.println("local inst ID : " + instID);
            }
        };
    }
}

public class LocalParamAnonymous {
    public static void main(String[] args) {
        OuterClass4 out = new OuterClass4("My Outer Class");
        Readable3 localInst1 = out.createLocalClassInst(111);
        localInst1.read();

        Readable3 localInst2 = out.createLocalClassInst(222);
        localInst2.read();
    }
}
