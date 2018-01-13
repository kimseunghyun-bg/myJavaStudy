package chapter22.practice;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
class SimpleNumber2 {
    int num;

    public SimpleNumber2(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num % 3;
    }

    @Override
    public boolean equals(Object obj) {
        SimpleNumber2 comp = (SimpleNumber2) obj;
        if (comp.num == num) {
            return true;
        } else {
            return false;
        }
    }
}

public class HashSetEqualityTwo {
    public static void main(String[] args) {
        HashSet<SimpleNumber2> hSet = new HashSet<>();
        hSet.add(new SimpleNumber2(10));
        hSet.add(new SimpleNumber2(20));
        hSet.add(new SimpleNumber2(20));

        System.out.println("저장된 데이터 수 : " + hSet.size());

        Iterator<SimpleNumber2> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
