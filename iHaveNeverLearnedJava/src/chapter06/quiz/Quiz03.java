package chapter06.quiz;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class Quiz03 {
    public static void main(String[] args) {
        int r = 5;
        System.out.println("원의 넓이 : "+calCircleArea(r));
        System.out.println("원의 둘레 : "+calCircleRound(r));
    }

    private static double calCircleArea(double rad){
        double PI = 3.14;
        return rad*rad*PI;
    }

    private static double calCircleRound(double rad){
        double PI = 3.14;
        return 2*rad*PI;
    }
}
