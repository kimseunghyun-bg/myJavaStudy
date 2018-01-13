package chpater19.quiz;

/**
 * Created by kimseunghyun on 2017-10-22.
 */

class Point {
    int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.xPos == ((Point) obj).xPos && this.yPos == ((Point) obj).yPos) {
            return true;
        } else {
            return false;
        }
    }
}

class Rectangle implements Cloneable{
    Point upperLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.upperLeft = new Point(x1, y1);
        this.lowerRight = new Point(x2, y2);
    }

    public void showPosition() {
        System.out.println("직사각형 위치정보...");
        System.out.print("좌 상단 : ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("우 하단 : ");
        lowerRight.showPosition();
        System.out.println("\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (this.upperLeft.equals(((Rectangle) obj).upperLeft)
                && this.lowerRight.equals(((Rectangle) obj).lowerRight)) {
            return true;
        } else {
            return false;
        }
    }
}

public class EncapsulationEquals {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5, 5, 10, 11);
        Rectangle rec2 = new Rectangle(5, 5, 10, 10);
        System.out.println(rec1.equals(rec2));
    }
}
