package chapter09.practice;

/**
 * Created by kimseunghyun on 2017-07-16.
 */
class SinivelCap1 {
    public void take() {
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap1 {
    public void take() {
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap1 {
    public void take() {
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class ColdPatient1 {
    public void takeSinivelCap(SinivelCap1 cap) {
        cap.take();
    }

    public void takeSneezeCap(SneezeCap1 cap) {
        cap.take();
    }

    public void takeSnuffleCap(SnuffleCap1 cap) {
        cap.take();
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        ColdPatient1 sufferer = new ColdPatient1();
        sufferer.takeSinivelCap(new SinivelCap1());
        sufferer.takeSneezeCap(new SneezeCap1());
        sufferer.takeSnuffleCap(new SnuffleCap1());
    }
}
