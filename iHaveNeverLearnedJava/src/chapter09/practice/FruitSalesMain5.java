package chapter09.practice;

/**
 * Created by kimseunghyun on 2017-07-16.
 */

class FruitSeller5 {
    private int numOfApple;
    private int myMoney;
    private final int APPLE_PRICE;

    public FruitSeller5(int money, int appleNum, int price) {
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

class FruitBuyer5 {
    private int myMoney;
    private int numOfApple;

    public FruitBuyer5(int myMoney) {
        this.myMoney = myMoney;
        this.numOfApple = 0;
    }

    public void buyApple(FruitSeller5 seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult() {
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }

}

public class FruitSalesMain5 {
    public static void main(String[] args) {
        FruitSeller5 seller = new FruitSeller5(0, 30, 1500);
        FruitBuyer5 buyer = new FruitBuyer5(10000);

        buyer.buyApple(seller, 4500);

        System.out.println("과일 판매자의 현재 상황");
        seller.showSaleResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showBuyResult();
    }
}
