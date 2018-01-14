package chapter17.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */
class ClassPrinter {
    public static void print(Object obj) {
        System.out.println(obj.toString());
    }
}

class Point {
    private int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "[x : " + xPos + ", y : " + yPos + "]";
    }
}

public class ImplObjectPrintln {
    public static void main(String[] args) {
        Point pos1 = new Point(1, 2);
        Point pos2 = new Point(5, 9);

        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
    }
}
