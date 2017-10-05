package chapter11.practice;

/**
 * Created by kimseunghyun on 2017-10-05.
 */
public class StringAdd {
    public static void main(String[] args) {
        String str1 = "Lemon" + "ade";
        String str2 = "Lemon" + 'A';
        String str3 = "Lemon" + 3;
        String str4 = 1 + "Lemon" + 2;
        str4+='!';

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
