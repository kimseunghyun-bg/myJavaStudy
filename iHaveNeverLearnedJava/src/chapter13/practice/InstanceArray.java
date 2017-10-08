package chapter13.practice;

/**
 * Created by kimseunghyun on 2017-10-07.
 */
public class InstanceArray {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        strArr[0] = new String("Java");
        strArr[1] = new String("Flex");
        strArr[2] = new String("Ruby");

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
