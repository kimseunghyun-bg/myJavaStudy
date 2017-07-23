package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-23.
 */

class AccessWay {
    static int num = 0;

    public AccessWay() {
        incrCnt();
    }

    public void incrCnt() {
        num++;
    }
}

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.incrCnt();;
        AccessWay.num++;
        System.out.println("num="+AccessWay.num);
    }
}
