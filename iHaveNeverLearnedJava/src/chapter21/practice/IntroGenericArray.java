package chapter21.practice;

/**
 * Created by kimseunghyun on 2017-11-07.
 */
public class IntroGenericArray {
    public static <T> void showArrayData(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] stArr = {"Hi!", "I'm so happy", "Java Generic Programming"};
        showArrayData(stArr);
    }
}
