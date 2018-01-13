package chapter22.practice;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
class SimpleNumber {
    int num;

    public SimpleNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class HashSetEqualityOne {
    public static void main(String[] args) {
        HashSet<SimpleNumber> hSet = new HashSet<>();
        hSet.add(new SimpleNumber(10));
        hSet.add(new SimpleNumber(20));
        hSet.add(new SimpleNumber(20));

        System.out.println("저장된 데이터 수 : " + hSet.size());

        Iterator<SimpleNumber> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
