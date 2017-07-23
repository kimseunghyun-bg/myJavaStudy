package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-22.
 */

class InstCnt {
    static int instNum = 0;

    public InstCnt() {
        this.instNum++;
        System.out.println("인스턴스 생성 : "+instNum);
    }
}

public class ClassVar {
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();
    }
}