package chapter07.practice;

/**
 * Created by kimseunghyun on 2017-07-15.
 */
class FruitSeller3 {
    int numOfApple;
    int myMoney;
    final int APPLE_PRICE;

    public FruitSeller3(int money, int appleNum, int price) {
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

class FruitBuyer3 {
    int myMoney;
    int numOfApple;

    public FruitBuyer3(int myMoney) {
        this.myMoney = myMoney;
        this.numOfApple = 0;
    }

    public void buyApple(FruitSeller3 seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult() {
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }
}

public class FruitSalesMain3 {
    public static void main(String[] args) {
        FruitSeller3 seller1 = new FruitSeller3(0,30,1500);
        FruitSeller3 seller2 = new FruitSeller3(0,20,1000);

        FruitBuyer3 buyer = new FruitBuyer3(10000);
        buyer.buyApple(seller1, 4500);
        buyer.buyApple(seller2, 2000);

        System.out.println("과일 판매자1의 현재 상황");
        seller1.showSaleResult();

        System.out.println("과일 판매자2의 현재 상황");
        seller2.showSaleResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showBuyResult();
    }
}
