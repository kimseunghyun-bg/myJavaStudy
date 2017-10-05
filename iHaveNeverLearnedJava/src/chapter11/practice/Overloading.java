package chapter11.practice;

/**
 * Created by kimseunghyun on 2017-07-30.
 */
class Person {

    private int perID;
    private int milID;

    public Person(int perID, int milID) {
        this.perID = perID;
        this.milID = milID;
    }

    public Person(int perID) {
        this.perID = perID;
        this.milID = 0;
    }

    public void showInfo() {
        System.out.println("민번 : " + this.perID);
        if (this.milID != 0) {
            System.out.println("군번 : " + this.milID + "\n");
        } else {
            System.out.println("군과 관계 없음 \n");
        }
    }
}

public class Overloading {
    public static void main(String[] args) {
        Person man = new Person(950123, 880102);
        Person woman = new Person(941125);
        man.showInfo();
        woman.showInfo();
    }
}