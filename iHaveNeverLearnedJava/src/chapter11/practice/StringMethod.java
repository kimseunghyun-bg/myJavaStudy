package chapter11.practice;

/**
 * Created by kimseunghyun on 2017-08-16.
 */
public class StringMethod {
    public static void main(String[] args) {
        String str1 = "Smart";
        String str2 = " and ";
        String str3 = "Simple";
        String str4 = str1.concat(str2).concat(str3);

        System.out.println(str4);
        System.out.println("문자열 길이 : " + str4.length());

        if (str1.compareTo(str3) < 0) {
            System.out.println("str1이 앞선다.");
        } else {
            System.out.println("str3이 앞선다.");
        }
    }
}
