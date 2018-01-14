package chapter17.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */

class TV {
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

class IPTV extends TV implements Computer {

    ComputerImpl comp = new ComputerImpl();

    @Override
    public void dataRecieve() {
        comp.dataRecieve();
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
