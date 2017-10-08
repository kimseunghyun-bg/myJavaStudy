package chapter15.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Gun {
    int bullet;

    public Gun(int bullet) {
        this.bullet = bullet;
    }

    public void shot() {
        System.out.println("BBANG!");
        bullet--;
    }
}

class Police extends Gun {
    int handcuffs;

    public Police(int bullet, int handcuffs) {
        super(bullet);
        this.handcuffs = handcuffs;
    }

    public void putHandcuff() {
        System.out.println("SNAP!");
        handcuffs--;
    }
}

public class HASInheritance {
    public static void main(String[] args) {
        Police police = new Police(5, 3);
        police.shot();
        police.putHandcuff();
    }
}
