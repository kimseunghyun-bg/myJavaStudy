package chapter13.practice;

/**
 * Created by kimseunghyun on 2017-10-07.
 */
public class AccessArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int sum = arr[0] + arr[1] + arr[2];
        System.out.println(sum);
    }
}
