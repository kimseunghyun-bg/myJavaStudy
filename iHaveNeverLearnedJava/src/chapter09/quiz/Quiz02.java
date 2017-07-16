package chapter09.quiz;

/**
 * Created by kimseunghyun on 2017-07-16.
 */

class Point {
    int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPointInfo() {
        System.out.println("["+this.xPos+", "+this.yPos+"]");
    }
}

class Circle {
    int rad;
    Point center;

    public Circle(int x, int y, int rad) {
        this.center = new Point(x, y);
        this.rad = rad;
    }

    public void showCircleInfo() {
        System.out.println("radius : " + this.rad);
        center.showPointInfo();
    }
}

class Ring {
    Circle innerCircle, outerCircle;

    public Ring(int inX, int inY, int inR, int outX, int outY, int outR) {
        innerCircle = new Circle(inX, inY, inR);
        outerCircle = new Circle(outX, outY, outR);
    }

    public void showRingInfo() {
        System.out.println("Inner Circle Info...");
        innerCircle.showCircleInfo();
        System.out.println("outer Circle Info...");
        outerCircle.showCircleInfo();
    }
}

public class Quiz02 {
    public static void main(String[] args) {
        Ring ring = new Ring(1, 1, 4, 2, 2, 9);
        ring.showRingInfo();
    }
}
