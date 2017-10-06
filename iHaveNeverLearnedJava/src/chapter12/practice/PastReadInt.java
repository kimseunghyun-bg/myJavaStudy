package chapter12.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kimseunghyun on 2017-10-06.
 */
public class PastReadInt {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("정수 입력 : ");
            String str = null;
            str = br.readLine();
            int num = Integer.parseInt(str);
            System.out.println("입력된 정수 : " + num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
