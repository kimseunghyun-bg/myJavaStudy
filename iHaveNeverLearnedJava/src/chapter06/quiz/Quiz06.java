package chapter06.quiz;

/**
 * Created by kimseunghyun on 2017-07-11.
 */
public class Quiz06 {
    public static void main(String[] args) {
        toBinary(10);
    }

    private static int toBinary(int decimal) {
        if (decimal > 0) {
            int bin;
            bin = decimal % 2;
            decimal /= 2;
            toBinary(decimal);
            System.out.println(bin);
        }
        return 0;
    }
}
