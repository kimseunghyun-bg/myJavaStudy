package chapter17.quiz;

import java.util.Scanner;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

abstract class Friend {
    String name;
    String phoneNum;
    String addr;

    public Friend(String name, String phoneNum, String addr) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.addr = addr;
    }

    public void showData() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
        System.out.println("주소 : " + addr);
    }

    public abstract void showBasicInfo();
}

class HighFriend extends Friend {
    String work;

    public HighFriend(String name, String phoneNum, String addr, String work) {
        super(name, phoneNum, addr);
        this.work = work;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("직업 : " + work);
    }

    @Override
    public void showBasicInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
    }
}

class UnivFriend extends Friend {
    String major;

    public UnivFriend(String name, String phoneNum, String addr, String major) {
        super(name, phoneNum, addr);
        this.major = major;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("전공 : " + major);
    }

    @Override
    public void showBasicInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
        System.out.println("전공 : " + major);
    }
}

class FriendInfoHandler {
    private Friend[] myFriends;
    private int numOfFriends;

    public FriendInfoHandler(int num) {
        this.myFriends = new Friend[num];
        this.numOfFriends = 0;
    }

    private void addFriendInfo(Friend friend) {
        myFriends[numOfFriends++] = friend;
    }

    public void addFriend(int choice) {
        String name, phoneNum, addr, job, major;
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("전화 : ");
        phoneNum = scanner.nextLine();
        System.out.print("주소 : ");
        addr = scanner.nextLine();

        if (choice == 1) {
            System.out.print("직업 : ");
            job = scanner.nextLine();
            addFriendInfo(new HighFriend(name, phoneNum, addr, job));
        } else if (choice == 2) {
            System.out.print("전공 : ");
            major = scanner.nextLine();
            addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
        }
        System.out.println("입력 완료! \n");
    }

    public void showAllData() {
        for (int i = 0; i < numOfFriends; i++) {
            myFriends[i].showData();
            System.out.println("");
        }
    }

    public void showAllSimpleData() {
        for (int i = 0; i < numOfFriends; i++) {
            myFriends[i].showBasicInfo();
            System.out.println("");
        }
    }
}

public class MyFriendInfoBook2 {
    public static void main(String[] args) {
        FriendInfoHandler handler = new FriendInfoHandler(10);

        while (true) {
            System.out.println("*** 메뉴 선택 ***");
            System.out.println("1. 고교 친구 저장");
            System.out.println("2. 대학 친구 저장");
            System.out.println("3. 전체 정보 출력");
            System.out.println("4. 기본 정보 출력");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택 : ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    handler.addFriend(choice);
                    break;
                case 3:
                    handler.showAllData();
                    break;
                case 4:
                    handler.showAllSimpleData();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
