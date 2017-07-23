package chapter10.practice;

/**
 * Created by kimseunghyun on 2017-07-23.
 */

class Circle {
    static final double PI = 3.1415;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void showPerimeter(){
        double peri = (this.radius * 2) * this.PI;
        System.out.println("둘레 : " + peri);
    }
    public void showArea(){
        double area = (this.radius * this.radius) * this.PI;
        System.out.println("넓이 : " + area);
    }

}

public class ClassVarUse {
    public static void main(String[] args) {
        Circle cl = new Circle(1.2);
        cl.showPerimeter();
        cl.showArea();
    }
}
