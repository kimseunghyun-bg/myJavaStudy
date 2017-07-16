package chapter09.practice;

/**
 * Created by kimseunghyun on 2017-07-16.
 */

class FruitSeller4 {
    int numOfApple;
    int myMoney;
    final int APPLE_PRICE;

    public FruitSeller4(int money, int appleNum, int price) {
        this.myMoney = money;
        this.numOfApple = appleNum;
        this.APPLE_PRICE = price;
    }

    public int saleApple(int money) {
        int num = money / APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        return num;
    }

    public void showSaleResult() {
        System.out.println("남은 사과 : " + numOfApple);
        System.out.println("판매 수익 : " + myMoney);
    }
}

class FruitBuyer4 {
    int myMoney;
    int numOfApple;

    public FruitBuyer4(int myMoney) {
        this.myMoney = myMoney;
        this.numOfApple = 0;
    }

    public void buyApple(FruitSeller4 seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult() {
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }
}

public class FruitSalesMain4 {
    public static void main(String[] args) {
        FruitSeller4 seller = new FruitSeller4(0, 30, 1500);
        FruitBuyer4 buyer = new FruitBuyer4(10000);

        seller.myMoney += 500;  //돈 500원 내고!
        buyer.myMoney -= 500;

        seller.numOfApple -= 20;    //사과 20개 가져가는 꼴!
        buyer.numOfApple += 20;

        System.out.println("과일 판매자의 현재 상황");
        seller.showSaleResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showBuyResult();
    }
}
