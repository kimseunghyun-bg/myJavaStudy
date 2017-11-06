package chpater21.practice;

/**
 * Created by kimseunghyun on 2017-11-07.
 */

class Fruit1 {
    public void showYou() {
        System.out.println("난 과일입니다.");
    }
}

class Apple2 extends Fruit1 {
    @Override
    public void showYou() {
        super.showYou();
        System.out.println("난 붉은 과일입니다.");
    }
}

class FruitBox3<T> {
    T item;

    public void store(T item) {
        this.item = item;
    }

    public T pullOut() {
        return item;
    }
}

public class IntroWildCard {
    public static void openAndShowFruitBox(FruitBox3<? extends Fruit1> box) {
        Fruit1 fruit = box.pullOut();
        fruit.showYou();
    }

    public static void main(String[] args) {
        FruitBox3<Fruit1> box1 = new FruitBox3<>();
        box1.store(new Fruit1());

        FruitBox3<Apple2> box2 = new FruitBox3<>();
        box2.store(new Apple2());

        openAndShowFruitBox(box1);
        openAndShowFruitBox(box2);

    }
}
