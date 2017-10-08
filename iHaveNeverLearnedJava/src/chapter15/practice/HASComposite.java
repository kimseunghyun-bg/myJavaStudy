package chapter15.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Gun2 {
    int bullet;

    public Gun2(int bullet) {
        this.bullet = bullet;
    }

    public void shot() {
        System.out.println("BBANG!");
        bullet--;
    }
}

class Police2 {
    int handcuffs;
    Gun2 pistol;

    public Police2(int bullet, int handcuffs) {
        this.handcuffs = handcuffs;
        if (bullet > 0) {
            pistol = new Gun2(bullet);
        } else {
            pistol = null;
        }
    }

    public void putHandcuff() {
        System.out.println("SNAP!");
        handcuffs--;
    }

    public void shot() {
        if (pistol == null) {
            System.out.println("Hut BBANG!");
        } else {
            pistol.shot();
        }
    }
}

public class HASComposite {
    public static void main(String[] args) {
        Police2 haveGun = new Police2(5, 3);
        haveGun.shot();
        haveGun.putHandcuff();

        Police2 dontHaveGun = new Police2(0, 3);
        dontHaveGun.shot();
    }
}
