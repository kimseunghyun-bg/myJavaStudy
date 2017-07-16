package chapter09.practice;

/**
 * Created by kimseunghyun on 2017-07-16.
 */
class SinivelCap2 {
    public void take() {
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap2 {
    public void take() {
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap2 {
    public void take() {
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class CONTAC600 {
    SinivelCap2 sin;
    SneezeCap2 sne;
    SnuffleCap2 snu;

    public CONTAC600() {
        this.sin = new SinivelCap2();
        this.sne = new SneezeCap2();
        this.snu = new SnuffleCap2();
    }

    public void take() {
        this.sin.take();
        this.sne.take();
        this.snu.take();
    }
}

class ColdPatient2 {
    public void takeCONTAC600(CONTAC600 cap) {
        cap.take();
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        ColdPatient2 sufferer = new ColdPatient2();
        sufferer.takeCONTAC600(new CONTAC600());
    }
}
