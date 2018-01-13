package chpater19.practice;

/**
 * Created by kimseunghyun on 2017-10-22.
 */

class Point2 implements Cloneable{
    int xPos, yPos;

    public Point2(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.xPos == ((Point2) obj).xPos && this.yPos == ((Point2) obj).yPos) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class InstanceCloning {
    public static void main(String[] args) {
        Point2 org = new Point2(3, 5);
        Point2 cpy;

        try {
            cpy = (Point2) org.clone();
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
