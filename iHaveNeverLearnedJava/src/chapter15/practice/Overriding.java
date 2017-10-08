package chapter15.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Speaker {
    private int volumeRate;

    public void showCurrentState() {
        System.out.println("볼륨 크기 : " + this.volumeRate);
    }

    public void setVolume(int volume) {
        this.volumeRate = volume;
    }
}

class BaseEnSpeaker extends Speaker {
    private int baseRate;

    @Override
    public void showCurrentState() {
        super.showCurrentState();
        System.out.println("베이스 크기 : " + this.baseRate);
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}

public class Overriding {
    public static void main(String[] args) {
        BaseEnSpeaker baseEnSpeaker = new BaseEnSpeaker();
        baseEnSpeaker.setVolume(10);
        baseEnSpeaker.setBaseRate(20);
        baseEnSpeaker.showCurrentState();
    }
}
