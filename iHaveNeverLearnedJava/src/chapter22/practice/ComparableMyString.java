package chapter22.practice;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
class MyString implements Comparable<MyString> {
    String str;

    public MyString(String str) {
        this.str = str;
    }

    public int getLength() {
        return str.length();
    }

    @Override
    public int compareTo(MyString o) {
        if (getLength() > o.getLength()) {
            return 1;
        } else if (getLength() < o.getLength()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return str;
    }
}

public class ComparableMyString {
    public static void main(String[] args) {
        TreeSet<MyString> tSet = new TreeSet<>();
        tSet.add(new MyString("Orange"));
        tSet.add(new MyString("Apple"));
        tSet.add(new MyString("Dog"));
        tSet.add(new MyString("Individual"));

        Iterator<MyString> itr = tSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
