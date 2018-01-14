package chapter17.quiz;

/**
 * Created by kimseunghyun on 2017-10-09.
 */

interface TV {
    void onTV();
}

class TVImpl implements TV {
    @Override
    public void onTV() {
        System.out.println("영상 출력 중");
    }
}

interface Computer {
    void dataRecieve();
}

class ComputerImpl implements Computer {
    @Override
    public void dataRecieve() {
        System.out.println("영상 데이터 수신 중");
    }
}

class IPTV implements Computer, TV {

    ComputerImpl comp = new ComputerImpl();
    TVImpl tv = new TVImpl();

    @Override
    public void dataRecieve() {
        comp.dataRecieve();
    }

    @Override
    public void onTV() {
        tv.onTV();
    }

    public void powerOn() {
        dataRecieve();
        onTV();
    }
}

public class MultiInheriAlternative {
    public static void main(String[] args) {
        IPTV iptv = new IPTV();
        iptv.powerOn();

        TV tv = iptv;
        Computer comp = iptv;
    }
}
