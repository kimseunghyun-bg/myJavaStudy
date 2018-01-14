package chapter22.practice;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
public class IntroTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "data1");
        treeMap.put(3, "data3");
        treeMap.put(5, "data5");
        treeMap.put(2, "data2");
        treeMap.put(4, "data4");

        NavigableSet<Integer> navigableSet = treeMap.navigableKeySet();

        System.out.println("오름차순 출력...");
        Iterator<Integer> itr = navigableSet.iterator();
        while (itr.hasNext()) {
            System.out.println(treeMap.get(itr.next()));
        }

        System.out.println("내림차순 출력...");
        itr = navigableSet.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(treeMap.get(itr.next()));
        }
    }
}
