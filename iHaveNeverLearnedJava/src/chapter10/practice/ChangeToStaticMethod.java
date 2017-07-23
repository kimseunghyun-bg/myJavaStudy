package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-24.
 */

class SimepleMath2 {
    public static final double PI = 3.1415;
    public static double add(double n1, double n2) {
        return n1 + n2;
    }
    public static double min(double n1, double n2) {
        return n1 - n2;
    }
    public static double mul(double n1, double n2) {
        return n1 * n2;
    }
}

class AreaMath2 {
    public static double calCircleArea(double rad) {
        double result = SimepleMath2.mul(rad, rad);
        result = SimepleMath2.mul(result, SimepleMath2.PI);
        return result;
    }

    public static double calRectangleArea(double width, double height) {
        return SimepleMath2.mul(width, height);
    }
}

class PerimeterMath2 {
    public static double calCirclePeri(double rad) {
        double result = SimepleMath2.mul(rad, 2);
        result = SimepleMath2.mul(result, SimepleMath2.PI);
        return result;
    }

    public static double calRectanglePeri(double width, double height) {
        return SimepleMath2.add(SimepleMath2.mul(width, 2), SimepleMath2.mul(height, 2));
    }
}


public class ChangeToStaticMethod {
    public static void main(String[] args) {
        System.out.println("원의 넓이 : " + AreaMath2.calCircleArea(2.4));
        System.out.println("직사각형 둘레 : " + PerimeterMath2.calRectanglePeri(2.0, 4.0));
    }
}
