package chpater21.practice;

/**
 * Created by kimseunghyun on 2017-11-05.
 */
class Orange1 {
    int sugarContent;

    public Orange1(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 "+this.sugarContent);
    }
}

class FruitBox1 {
    Object item;

    public void store(Object item) {
        this.item = item;
    }

    public Object pullOut() {
        return this.item;
    }
}

public class ObjectBaseFruitBox {
    public static void main(String[] args) {
        FruitBox1 fruitBox1 = new FruitBox1();
        fruitBox1.store(new Orange1(10));
        Orange1 orange1 = (Orange1) fruitBox1.pullOut();
        orange1.showSugarContent();

        FruitBox1 fruitBox2 = new FruitBox1();
        fruitBox2.store("오렌지");
        Orange1 orange2 = (Orange1) fruitBox2.pullOut();
        orange2.showSugarContent();
    }
}
