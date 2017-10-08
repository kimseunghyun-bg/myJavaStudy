package chapter14.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Accumulator {
    private int val;

    Accumulator(int val) {
        this.val = val;
    }

    protected void accumulate(int num) {
        if (num < 0) {
            return;
        }
        val += num;
    }

    protected int getAccVal() {
        return this.val;
    }
}

class SavingAccount extends Accumulator {
    public SavingAccount(int val) {
        super(val);
    }

    public void saveMoney(int money) {
        accumulate(money);
    }

    public void showSavedMoney() {
        System.out.print("지금까지의 누적금액 : ");
        System.out.println(getAccVal());
    }
}

public class PrivateInheritance {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.saveMoney(1000);
        savingAccount.saveMoney(1000);
        savingAccount.showSavedMoney();
    }
}
