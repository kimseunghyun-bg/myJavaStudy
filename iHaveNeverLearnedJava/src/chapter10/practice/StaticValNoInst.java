package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-23.
 */

class InstCnt2 {
    static int instNum = 100;

    public InstCnt2() {
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

public class StaticValNoInst {
    public static void main(String[] args) {
        InstCnt2.instNum -= 15;
        System.out.println(InstCnt2.instNum);
    }
}
