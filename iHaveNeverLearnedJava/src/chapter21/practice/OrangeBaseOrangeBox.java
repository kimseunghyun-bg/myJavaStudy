package chapter21.practice;

/**
 * Created by kimseunghyun on 2017-11-05.
 */

class Orange2 {
    int sugarContent;

    public Orange2(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 "+this.sugarContent);
    }
}

class OrangeBox {
    Orange2 item;

    public void store(Orange2 item) {
        this.item = item;
    }

    public Orange2 pullOut() {
        return this.item;
    }
}

public class OrangeBaseOrangeBox {
    public static void main(String[] args) {
        OrangeBox fruitBox1 = new OrangeBox();
        fruitBox1.store(new Orange2(10));
        Orange2 orange1 = fruitBox1.pullOut();
        orange1.showSugarContent();

//        OrangeBox fruitBox2 = new OrangeBox();
//        fruitBox2.store("오렌지");
//        Orange2 orange2 = fruitBox2.pullOut();
//        orange2.showSugarContent();
    }
}
