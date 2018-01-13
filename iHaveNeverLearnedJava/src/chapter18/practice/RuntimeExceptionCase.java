package chpater18.practice;

/**
 * Created by kimseunghyun on 2017-10-09.
 */
public class RuntimeExceptionCase {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[-1] = 20;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            Object obj = new int[10];
            String str = ((String) obj);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] arr = new int[-10];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            String str = null;
            int len = str.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
