package chpater19.practice;

/**
 * Created by kimseunghyun on 2017-10-23.
 */

class Point4 implements Cloneable {
    int xPos, yPos;

    public Point4(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
    }

    public void changePos(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle4 implements Cloneable {
    Point4 upperLeft, lowerRight;

    public Rectangle4(int x1, int y1, int x2, int y2) {
        this.upperLeft = new Point4(x1, y1);
        this.lowerRight = new Point4(x2, y2);
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

    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rectangle4 rec = (Rectangle4)super.clone();
        rec.upperLeft = (Point4) this.upperLeft.clone();
        rec.lowerRight = (Point4) this.lowerRight.clone();
        return rec;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Rectangle4 org = new Rectangle4(1, 1, 9, 9);
        Rectangle4 cpy;

        try {
            cpy = (Rectangle4) org.clone();
            org.changePos(2, 2, 7, 7);
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}