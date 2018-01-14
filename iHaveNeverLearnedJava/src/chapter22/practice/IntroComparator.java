package chapter22.practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
class StrLenComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class IntroComparator {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>(new StrLenComparator());
        tSet.add("Orange");
        tSet.add("Apple");
        tSet.add("Dog");
        tSet.add("Individual");

        Iterator<String> itr = tSet.iterator();
//        Iterator<String> itr = tSet.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
