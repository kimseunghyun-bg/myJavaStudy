package chpater21.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimseunghyun on 2017-11-05.
 */

class Orange3 {
    int sugarContent;

    public Orange3(int sugarContent) {

        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 " + this.sugarContent);
    }
}

class Apple1 {
    int weight;

    public Apple1(int weight) {
        this.weight = weight;
    }

    public void showAppleWeight() {
        System.out.println("무게 " + this.weight);
    }
}

class FruitBox2<T> {
    T item;

    public void store(T item) {
        this.item = item;
    }

    public T pullOut() {
        return this.item;
    }
}

public class GenericBaseFruitBox {
    public static void main(String[] args) {
        FruitBox2<Orange3> orBox = new FruitBox2<Orange3>();
        orBox.store(new Orange3(10));
        Orange3 org = orBox.pullOut();
        org.showSugarContent();

        FruitBox2<Apple1> apBox = new FruitBox2<Apple1>();
        apBox.store(new Apple1(20));
        Apple1 app = apBox.pullOut();
        app.showAppleWeight();

    }

}
