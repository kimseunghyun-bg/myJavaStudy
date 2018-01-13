package chapter22.practice;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
public class SetInterfaceFeature {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("First");
        hSet.add("Second");
        hSet.add("Third");
        hSet.add("Fourth");

        System.out.println("저장된 데이터 수 : " + hSet.size());

        Iterator<String> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
