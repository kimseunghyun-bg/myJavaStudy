package chapter15.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class AAA3 {
    public int num = 2;
}

class BBB3 extends AAA3 {
    public int num = 5;

    public void showSuperNum() {
        System.out.println("AAA3's num : " + super.num);
    }
}

class CCC3 extends BBB3 {
    public int num = 7;
    public void showAllNums() {
        super.showSuperNum();
        System.out.println("BBB3's num : " + super.num);
        System.out.println("CCC3's num : " + num);
    }
}

public class ShowAllReDecl {
    public static void main(String[] args) {
        CCC3 ref = new CCC3();
        ref.showAllNums();
    }
}
