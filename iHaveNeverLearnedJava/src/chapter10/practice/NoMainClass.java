package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-30.
 */
class Employer {
    private int myMoney;

    public Employer(int myMoney) {
        this.myMoney = myMoney;
    }

    public void payForWork(Employee emp, int money) {
        if (this.myMoney < money) {
            return;
        }
        emp.earnMoney(money);
        this.myMoney-=money;
    }

    public void showMyMoney(){
        System.out.println(this.myMoney);
    }
}

class Employee {
    private int myMoney;

    public Employee(int myMoney) {
        this.myMoney = myMoney;
    }

    public void earnMoney(int money) {
        this.myMoney += money;
    }

    public void showMyMoney() {
        System.out.println(this.myMoney);
    }
}

public class NoMainClass {
}
