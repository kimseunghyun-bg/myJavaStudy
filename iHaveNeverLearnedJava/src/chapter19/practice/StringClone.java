package chpater19.practice;

/**
 * Created by kimseunghyun on 2017-10-23.
 */
class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void showPersonInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
//        Person cpy = (Person)super.clone();
//        return cpy;
    }
}

public class StringClone {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("이승원", 22);

            Person p2 = (Person) p1.clone();
            p2.changeName("정혜영");

            Person p3 = (Person) p2.clone();
            p2.changeName("정승주");

            p1.showPersonInfo();
            p2.showPersonInfo();
            p3.showPersonInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
