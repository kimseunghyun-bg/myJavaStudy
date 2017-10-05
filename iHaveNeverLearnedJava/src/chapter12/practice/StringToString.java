package chapter12.practice;

/**
 * Created by kimseunghyun on 2017-10-06.
 */

class Friend {
    String myName;

    public Friend(String myName) {
        this.myName = myName;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "myName='" + myName + '\'' +
                '}';
    }
}

public class StringToString {
    public static void main(String[] args) {
        Friend fnd1 = new Friend("이종수");
        Friend fnd2 = new Friend("이종수");

        System.out.println(fnd1);
        System.out.println(fnd2);

        System.out.print("출력이 ");
        System.out.print("종료되었습니다.");
        System.out.println("");
    }
}
