package chapter12.quiz;

import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-10-06.
 */

class PhoneInfo {
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

public class PhoneBookVer02 {

    public static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 프로그램 종료");
        System.out.print("선택 : ");
    }

    public static void readData() {
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("전화번호 : ");
        String phone = scanner.nextLine();
        System.out.print("생년월일 : ");
        String birth = scanner.nextLine();

        PhoneInfo phoneInfo = new PhoneInfo(name, phone, birth);
        System.out.println("\n입력된 정보 출력...");
        phoneInfo.showPhoneInfo();
    }

    public static void main(String[] args) {
        boolean isTerminate = false;

        while (!isTerminate) {
            showMenu();
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                readData();
            } else if (num == 2) {
                isTerminate = true;
                System.out.println("프로그램 종료...");
            } else {
                System.out.println("1 또는 2를 입력해주세요.");
            }
        }
    }
}
