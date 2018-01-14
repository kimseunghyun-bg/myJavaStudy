package chapter19.quiz;

/**
 * Created by kimseunghyun on 2017-10-23.
 */

class Business implements Cloneable {
    private String company;
    private String work;

    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo() {
        System.out.println("회사 : "+this.company);
        System.out.println("업무 : "+this.work);
    }

    public void changeWork(String work) {
        this.work = work;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class PersonInfo implements Cloneable {
    private String name;
    private int age;
    private Business bness;

    public PersonInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        this.bness = new Business(company, work);
    }

    public void showPersonInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        this.bness.showBusinessInfo();
        System.out.println("");
    }

    public void changeWork(String work) {
        this.bness.changeWork(work);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonInfo cpy = (PersonInfo)super.clone();
        cpy.bness = (Business) bness.clone();
        return cpy;
    }
}

public class DeepCopyImpl {
    public static void main(String[] args) {
        try {
            PersonInfo pInfo = new PersonInfo("James", 22, "HiMedia", "encoding");
            PersonInfo pCopy = (PersonInfo)pInfo.clone();
            pCopy.changeWork("decoding");

            pInfo.showPersonInfo();
            pCopy.showPersonInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
