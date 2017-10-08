package chapter13.quiz;

/**
 * Created by kimseunghyun on 2017-10-07.
 */
public class ShiftArray {

    public static void shiftTwoDArr(int[][] arr) {
        int[] tempArr = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = tempArr;
    }

    public static void showTwoDArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("1차 shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);

        System.out.println("2차 shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);

        System.out.println("3차 shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);
    }
}
