package chapter09.quiz;

/**
 * Created by kimseunghyun on 2017-07-16.
 */

class Rectangle {
    private int ulx, uly;
    private int lrx, lry;

    private boolean isProperRange(int pos) {
        if (0 <= pos && pos <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public void setRectanglePoint(int ulx, int uly, int lrx, int lry) {
        if (ulx > lrx || uly > lry) {
            System.out.println("좌표 지정이 잘못되었습니다.");
            return;
        }
        if (!isProperRange(ulx) || !isProperRange(uly)) {
            System.out.println("좌 상단 좌표의 범위가 잘못되었습니다.");
            return;
        }
        if (!isProperRange(lrx) || !isProperRange(lry)) {
            System.out.println("우 하단 좌표의 범위가 잘못되었습니다.");
            return;
        }

        this.ulx = ulx; this.uly = uly; this.lrx=lrx; this.lry = lry;
    }

    public void showArea() {
        int xLen = this.lrx - this.ulx;
        int yLen = this.lry - this.uly;
        System.out.println("넓이 : " + (xLen * yLen));
    }

}

public class Quiz01 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setRectanglePoint(-3,-1,2,7);
        rec.showArea();

        rec.setRectanglePoint(2,2,8,8);
        rec.showArea();
    }
}
