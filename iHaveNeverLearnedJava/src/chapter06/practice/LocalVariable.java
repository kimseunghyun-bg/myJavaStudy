package chapter06.practice;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class LocalVariable {
    public static void main(String[] args) {
        boolean scope = true;
        if (scope) {
            int num = 1;
            num++;
            System.out.println(num);
        } else {
            int num = 2;
            System.out.println(num);
        }
        
        simple();
    }

    private static void simple() {
        int num = 3;
        System.out.println(num);
    }
}
