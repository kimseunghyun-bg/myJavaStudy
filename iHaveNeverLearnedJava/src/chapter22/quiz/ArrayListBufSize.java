package chapter22.quiz;

import java.util.ArrayList;

/**
 * Created by Seunghyun Kim on 2018-01-13
 */
public class ArrayListBufSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(500);

        list.add(0);
        list.add(1);
        list.ensureCapacity(list.size()*2);
    }
}
