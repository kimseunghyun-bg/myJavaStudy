package chapter22.practice;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.printf("%s %d \n", name, age);
    }

    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return 1;
        } else if (age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class CompareablePerson {
    public static void main(String[] args) {
        TreeSet<Person> sTree = new TreeSet<>();
        sTree.add(new Person("Lee", 24));
        sTree.add(new Person("Hong", 29));
        sTree.add(new Person("Choi", 21));

        Iterator<Person> itr = sTree.iterator();
        while (itr.hasNext()) {
            itr.next().showData();
        }
    }
}
