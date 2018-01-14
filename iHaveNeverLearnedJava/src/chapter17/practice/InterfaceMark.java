package chapter17.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

interface UpperCasePrintable {

}

class ClassPrinter2 {
    public static void print(Object obj) {
        String org = obj.toString();
        if (obj instanceof UpperCasePrintable) {
            org = org.toUpperCase();
        }
        System.out.println(org);
    }
}

class PointOne implements UpperCasePrintable {
    private int xPos, yPos;

    public PointOne(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "[x : " + xPos + ", y : " + yPos + "]";
    }
}

class PointTwo {
    private int xPos, yPos;

    public PointTwo(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "[x : " + xPos + ", y : " + yPos + "]";
    }
}

public class InterfaceMark {
    public static void main(String[] args) {
        PointOne pos1 = new PointOne(1, 1);
        PointTwo pos2 = new PointTwo(2, 2);
        PointOne pos3 = new PointOne(3, 3);
        PointTwo pos4 = new PointTwo(4, 4);

        ClassPrinter2.print(pos1);
        ClassPrinter2.print(pos2);
        ClassPrinter2.print(pos3);
        ClassPrinter2.print(pos4);
    }
}
