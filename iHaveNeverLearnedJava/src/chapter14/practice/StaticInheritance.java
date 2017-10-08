package chapter14.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Adder {
    public static int val = 0;

    public void add(int num) {
        val += num;
    }
}

class AdderFriend extends Adder {
    public void friendAdd(int num) {
        val += num;
    }
    public void showVal() {
        System.out.println(val);
    }
}

public class StaticInheritance {
    public static void main(String[] args) {
        Adder adder = new Adder();
        AdderFriend adderFriend = new AdderFriend();
        adder.add(1);
        adderFriend.add(3);
        AdderFriend.val += 5;
        adderFriend.showVal();
    }
}
