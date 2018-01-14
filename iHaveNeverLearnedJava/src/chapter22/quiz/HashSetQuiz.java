package chapter22.quiz;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Seunghyun Kim on 2018-01-14
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.name == ((Person) obj).name && this.age == ((Person) obj).age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }
}

public class HashSetQuiz {
    public static void main(String[] args) {
        HashSet<Person> hSet = new HashSet<>();
        hSet.add(new Person("이진호", 10));
        hSet.add(new Person("이진호", 20));
        hSet.add(new Person("김명호", 20));
        hSet.add(new Person("김명호", 15));
        hSet.add(new Person("이진호", 20));
        hSet.add(new Person("김명호", 20));

        System.out.println("저장된 데이터 수 : " + hSet.size());

        Iterator<Person> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
