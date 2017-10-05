package chapter11.practice;

/**
 * Created by kimseunghyun on 2017-08-13.
 */
class Person2 {
    private int perID;
    private int milID;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person2(int perID, int milID, int birthYear, int birthMonth, int birthDay) {
        this.perID = perID;
        this.milID = milID;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public Person2(int pID, int bYear, int bMonth, int bDay) {
        this(pID, 0, bYear, bMonth, bDay);
    }

    public void showInfo() {
        System.out.println("민번 : " + this.perID);
        System.out.println("생년월일 : " + this.birthYear + "/" + this.birthMonth + "/" + this.birthDay);
        if (this.milID != 0) {
            System.out.println("군번 : " + this.milID + "\n");
        } else {
            System.out.println("군과 관계 없음 \n");
        }
    }
}

public class CstOverloading {
    public static void main(String[] args) {
        Person2 man = new Person2(951203, 880102, 1995, 12, 3);
        Person2 woman = new Person2(991107, 1999, 11, 7);
        man.showInfo();
        woman.showInfo();
    }
}
