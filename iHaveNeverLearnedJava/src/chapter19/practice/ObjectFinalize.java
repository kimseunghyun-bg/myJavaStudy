package chapter19.practice;

/**
 * Created by kimseunghyun on 2017-10-22.
 */

class MyName {
    String objName;

    public MyName(String objName) {
        this.objName = objName;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(objName + "이 소멸되었습니다.");
    }
}

public class ObjectFinalize {
    public static void main(String[] args) {
        MyName obj1 = new MyName("인스턴스 1");
        MyName obj2 = new MyName("인스턴스 2");
        obj1 = null;
        obj2 = null;

        System.out.println("프로그램을 종료합니다.");
        System.gc();
        System.runFinalization();
    }
}
