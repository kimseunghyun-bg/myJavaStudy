package chapter12.practice;

/**
 * Created by kimseunghyun on 2017-10-06.
 */
public class FormatString {
    public static void main(String[] args) {
        int age = 20;
        double tall = 175.7;
        String name = "홍자바";

        System.out.printf("제 이름은 %s 입니다. \n", name);
        System.out.printf("나이는 %d이고, 키는 %e 입니다. \n", age, tall);
        System.out.printf("%d %o %x \n", 77, 77, 77);
        System.out.printf("%g %g \n", 0.00014, 0.000014);

    }
}
