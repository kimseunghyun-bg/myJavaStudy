package chapter13.quiz;

/**
 * Created by kimseunghyun on 2017-10-07.
 */
public class ArrayMinMax {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("maxValue : " + maxValue(arr));
        System.out.println("minValue : " + minValue(arr));
    }
}
