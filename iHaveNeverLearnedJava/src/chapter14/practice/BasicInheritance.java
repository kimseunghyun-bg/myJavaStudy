package chapter14.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public void tellYourName() {
        System.out.println("My name is " + this.name);
    }
}

class BusinessMan extends Man {
    private String company;
    private String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("My company is " + this.company);
        System.out.println("My position is " + this.position);
        tellYourName();
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("Mr. Hong", "Hybrid 3D ELD", "Staff Eng.");
        BusinessMan man2 = new BusinessMan("Mr. Lee", "Hybrid 3D ELD", "Assist Eng.");

        System.out.println("First man info..........");
        man1.tellYourName();
        man1.tellYourInfo();
        System.out.println("Second man info..........");
        man2.tellYourInfo();
    }
}
