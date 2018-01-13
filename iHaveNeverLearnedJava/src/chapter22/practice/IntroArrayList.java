package chapter22.practice;

import java.util.ArrayList;

/**
 * Created by kimseunghyun on 2018-01-13
 */
public class IntroArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        /* 데이터의 저장 */
        list.add(new Integer(11));
        list.add(new Integer(22));
        list.add(new Integer(33));

        /* 데이터의 참조 */
        System.out.println("1차 참조");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 데이터의 삭제 */
        list.remove(0);
        System.out.println("2차 참조");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(0));
        }
    }
}
