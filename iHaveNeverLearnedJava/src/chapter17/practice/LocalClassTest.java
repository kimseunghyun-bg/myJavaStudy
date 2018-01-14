package chapter17.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
interface Readable {
    void read();
}

class OuterClass2 {
    private String myName;

    public OuterClass2(String myName) {
        this.myName = myName;
    }

    /*
    public Readable createLocalClassInst() {
        class LocalClass implements Readable {
            @Override
            public void read() {
                System.out.println("Outer inst name : " + myName);
            }
        }
        return new LocalClass();
    }
    */

    public Readable createLocalClassInst() {
        Readable readable = () -> System.out.println("Outer inst name : " + myName);
        return readable;
    }
}

public class LocalClassTest {
    public static void main(String[] args) {
        OuterClass2 out1 = new OuterClass2("First");
        Readable localInst1 = out1.createLocalClassInst();
        localInst1.read();

        OuterClass2 out2 = new OuterClass2("Second");
        Readable localInst2 = out2.createLocalClassInst();
        localInst2.read();
    }
}
