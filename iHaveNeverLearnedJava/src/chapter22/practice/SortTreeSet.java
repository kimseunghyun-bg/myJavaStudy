package chapter22.practice;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
public class SortTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> sTree = new TreeSet<>();
        sTree.add(1);
        sTree.add(2);
        sTree.add(4);
        sTree.add(3);
        sTree.add(2);

        System.out.println("저장된 데이터 수 : " + sTree.size());

        Iterator<Integer> itr = sTree.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
