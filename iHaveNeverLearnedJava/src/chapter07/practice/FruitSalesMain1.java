package chapter07.practice;

/**
 * Created by kimseunghyun on 2017-07-15.
 */
class FruitSeller1 {
    int numOfApple = 20;
    int myMoney = 0;
    final int APPLE_PRICE = 1000;

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

class FruitBuyer1 {
    int myMoney = 5000;
    int numOfApple = 0;

    public void buyApple(FruitSeller1 seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult(){
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }
}

public class FruitSalesMain1 {
    public static void main(String[] args) {
        FruitSeller1 seller = new FruitSeller1();
        FruitBuyer1 buyer = new FruitBuyer1();
        buyer.buyApple(seller, 2000);

        System.out.println("과일 판매자의 현재 상황");
        seller.showSaleResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showBuyResult();
    }
}
