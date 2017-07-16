package chapter07.practice;

/**
 * Created by kimseunghyun on 2017-07-15.
 */
class FruitSeller2 {
    int numOfApple = 20;
    int myMoney = 0;
    int APPLE_PRICE = 1000;

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

    public void initMembers(int money, int appleNum, int price) {
        myMoney = money;
        numOfApple = appleNum;
        APPLE_PRICE = price;
    }
}

class FruitBuyer2 {
    int myMoney = 10000;
    int numOfApple = 0;

    public void buyApple(FruitSeller2 seller, int money) {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }

    public void showBuyResult() {
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }
}

public class FruitSalesMain2 {
    public static void main(String[] args) {
        FruitSeller2 seller1 = new FruitSeller2();
        seller1.initMembers(0, 30, 1500);

        FruitSeller2 seller2 = new FruitSeller2();
        seller2.initMembers(0, 20, 1000);

        FruitBuyer2 buyer = new FruitBuyer2();
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
