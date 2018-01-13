package chpater20.practice;

/**
 * Created by kimseunghyun on 2017-11-04.
 */

class IntWrapper {
    private int num;

    public IntWrapper(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ""+num;
    }
}

public class WrappingInteger {
    public static void showData(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        IntWrapper intWrapper = new IntWrapper(3);
        showData(intWrapper);
        showData(new IntWrapper(7));
    }
}
