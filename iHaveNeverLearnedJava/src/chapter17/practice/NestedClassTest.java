package chpater17.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
class OuterClassOne {
    public OuterClassOne() {
        NestedClass nst = new NestedClass();
        nst.simpleMethod();
    }

    static class NestedClass {
        public void simpleMethod() {
            System.out.println("Nested Instance Method One");
        }
    }
}

class OuterClassTwo {
    public OuterClassTwo() {
        NestedClass nst = new NestedClass();
        nst.simpleMethod();
    }

    private static class NestedClass {
        public void simpleMethod() {
            System.out.println("Nested Instance Method Two");
        }
    }
}

public class NestedClassTest {
    public static void main(String[] args) {
        OuterClassOne one = new OuterClassOne();
        OuterClassTwo two = new OuterClassTwo();

        OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
        nst1.simpleMethod();
    }
}
