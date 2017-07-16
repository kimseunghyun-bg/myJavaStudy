package chapter07.quiz;

/**
 * Created by kimseunghyun on 2017-07-15.
 */
public class Quiz02 {
    public static void main(String[] args) {
        Child child1 = new Child(15);
        Child child2 = new Child(9);

        System.out.println("게임 전 구슬의 보유 개수");
        System.out.println("어린이1****");
        child1.showProperty();
        System.out.println("어린이2****");
        child2.showProperty();

        // 1차 게임! 어린이1은 어린이2의 구슬 2개 획득
        child1.obtainBead(child2, 2);

        // 2차 게임! 어린이2은 어린이1의 구슬 7개 획득
        child2.obtainBead(child1, 7);

        System.out.println("");
        System.out.println("게임 후 구슬의 보유 개수");
        System.out.println("어린이1****");
        child1.showProperty();
        System.out.println("어린이2****");
        child2.showProperty();
    }
}

class Child {
    int numOfBead;

    public Child(int numOfBead) {
        this.numOfBead = numOfBead;
    }

    public void obtainBead(Child child, int obtainCount) {
        int obtainBeadCount = child.loseBead(obtainCount);
        this.numOfBead += obtainBeadCount;
    }

    public int loseBead(int loseCount) {
        if (this.numOfBead < loseCount) {
            int retValue = loseCount;
            this.numOfBead = 0;
            return retValue;
        }

        this.numOfBead -= loseCount;
        return loseCount;
    }

    public void showProperty() {
        System.out.println("보유 구슬의 개수 : " + this.numOfBead);
    }

}
