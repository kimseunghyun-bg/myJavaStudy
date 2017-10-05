package chapter11.quiz;

/**
 * Created by kimseunghyun on 2017-10-05.
 */
public class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = null;
    }

    public void showPhoneInfo() {
        System.out.println("name : " + this.name);
        System.out.println("phone : " + this.phoneNumber);
        if (this.birthday != null) {
            System.out.println("birthday : " + this.birthday);
        }
        System.out.println("");
    }

}
