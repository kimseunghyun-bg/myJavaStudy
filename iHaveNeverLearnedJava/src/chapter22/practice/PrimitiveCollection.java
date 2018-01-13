package chapter22.practice;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
public class PrimitiveCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int num = itr.next();
            System.out.println(num);
        }
    }
}
