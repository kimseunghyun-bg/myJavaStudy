package chapter07.practice;

/**
 * Created by kimseunghyun on 2017-07-15.
 */
class Number {
    int num = 0;

    public void addNum(int n) {
        num += n;
    }

    public int getNumber() {
        return num;
    }
}

public class PassInstance {
    public static void main(String[] args) {
        Number nInst = new Number();
        System.out.println("메소드 호출 전 : " + nInst.getNumber());

        simpleMethod(nInst);
        System.out.println("메소드 호출 후 : " + nInst.getNumber());
    }

    public static void simpleMethod(Number numb) {
        numb.addNum(12);
    }
}
