package chapter07.quiz;

/**
 * Created by kimseunghyun on 2017-07-15.
 */
public class Quiz01 {
    public static void main(String[] args) {
        Triangle tri = new Triangle(10.2, 6.1);
        System.out.println("삼각형의 넓이 : " + tri.getArea());

        tri.setHeight(20.2);
        tri.setWidth(30.3);
        System.out.println("삼각형의 넓이 : " + tri.getArea());
    }
}

class Triangle {
    double height;
    double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.height*this.width/2;
    }
}
