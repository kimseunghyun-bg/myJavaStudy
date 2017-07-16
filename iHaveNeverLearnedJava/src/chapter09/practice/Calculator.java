package chapter09.practice;

/**
 * Created by kimseunghyun on 2017-07-16.
 */
public class Calculator {
    private Adder adder;
    private Subtractor subtractor;

    public Calculator() {
        this.adder = new Adder();
        this.subtractor = new Subtractor();
    }

    public int addTwoNumber(int num1, int num2) {
        return adder.addTwoNumber(num1, num2);
    }

    public int subTwoNumber(int num1, int num2) {
        return subtractor.subTwoNumber(num1, num2);
    }

    public void showOperatingTimes() {
        System.out.println("덧셈 횟수 : " + adder.getCntAdd());
        System.out.println("뺄셈 횟수 : " + subtractor.getCntSub());
    }
}

class Adder {
    private int cntAdd;

    Adder() {
        cntAdd = 0;
    }

    int getCntAdd() {
        return this.cntAdd;
    }

    int addTwoNumber(int num1, int num2) {
        this.cntAdd++;
        return num1 + num2;
    }
}

class Subtractor {
    private int cntSub;

    Subtractor() {
        cntSub = 0;
    }

    int getCntSub() {
        return this.cntSub;
    }

    int subTwoNumber(int num1, int num2) {
        this.cntSub++;
        return num1 - num2;
    }
}


