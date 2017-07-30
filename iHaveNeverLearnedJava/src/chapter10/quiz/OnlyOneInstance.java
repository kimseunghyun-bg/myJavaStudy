package chapter10.quiz;

/**
 * Created by kimseunghyun on 2017-07-30.
 */

class SimpleNumber {

    int num = 0;
    private static SimpleNumber ourInstance = null;

    private SimpleNumber() {
    }

    public static SimpleNumber getInstance() {
        if (ourInstance == null) {
            return new SimpleNumber();
        }
        return ourInstance;
    }

    public void addNum(int n) {
        this.num += n;
    }

    public void showNum() {
        System.out.println(this.num);
    }
}

public class OnlyOneInstance {
    public static void main(String[] args) {
        SimpleNumber num1 = SimpleNumber.getInstance();
        num1.addNum(20);

        SimpleNumber num2 = SimpleNumber.getInstance();
        num2.addNum(30);

        num1.showNum();
        num2.showNum();
    }
}
