package chpater17.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */

interface Readable2 {
    void read();
}

class OuterClass3 {
    private String myName;

    public OuterClass3(String myName) {
        this.myName = myName;
    }

    /*public Readable2 createLocalClassInst(int instID) {
        class LocalClass implements Readable2 {
            @Override
            public void read() {
                System.out.println("Outer inst name : " + myName);
                System.out.println("local inst ID : " + instID);
            }
        }
        return new LocalClass();
    }*/

    public Readable2 createLocalClassInst(int instID) {
        Readable2 readable2 = () -> {
            System.out.println("Outer inst name : " + myName);
            System.out.println("local inst ID : " + instID);
        };
        return readable2;
    }
}

public class LocalParamClassTest {
    public static void main(String[] args) {
        OuterClass3 out = new OuterClass3("My Outer Class");
        Readable2 localInst1 = out.createLocalClassInst(111);
        localInst1.read();

        Readable2 localInst2 = out.createLocalClassInst(222);
        localInst2.read();
    }
}
