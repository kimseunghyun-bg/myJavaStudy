package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-23.
 */

class SimepleMath {
    public static final double PI = 3.1415;
    public double add(double n1, double n2) {
        return n1 + n2;
    }
    public double min(double n1, double n2) {
        return n1 - n2;
    }
    public double mul(double n1, double n2) {
        return n1 * n2;
    }
}

class AreaMath {
    public double calCircleArea(double rad) {
        SimepleMath sm = new SimepleMath();
        double result = sm.mul(rad, rad);
        result = sm.mul(result, SimepleMath.PI);
        return result;
    }

    public double calRectangleArea(double width, double height) {
        SimepleMath sm = new SimepleMath();
        return sm.mul(width, height);
    }
}

class PerimeterMath {
    public double calCirclePeri(double rad) {
        SimepleMath sm = new SimepleMath();
        double result = sm.mul(rad, 2);
        result = sm.mul(result, SimepleMath.PI);
        return result;
    }

    public double calRectanglePeri(double width, double height) {
        SimepleMath sm = new SimepleMath();
        return sm.add(sm.mul(width, 2), sm.mul(height, 2));
    }
}

public class HowMethod {
    public static void main(String[] args) {
        AreaMath am = new AreaMath();
        PerimeterMath pm = new PerimeterMath();

        System.out.println("원의 넓이 : " + am.calCircleArea(2.4));
        System.out.println("직사각형 둘레 : " + pm.calRectanglePeri(2.0, 4.0));
    }
}
