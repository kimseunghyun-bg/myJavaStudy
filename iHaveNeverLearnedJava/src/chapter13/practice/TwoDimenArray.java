package chapter13.practice;

/**
 * Created by kimseunghyun on 2017-10-07.
 */
public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = i + j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
