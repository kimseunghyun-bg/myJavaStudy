package chapter15.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

class Computer {
    private String owner;

    public Computer(String owner) {
        this.owner = owner;
    }

    public void calculate() {
        System.out.println("요청 내용을 계산합니다.");
    }
}

class NoteBookComp extends Computer {
    int battery;

    public NoteBookComp(String owner, int battery) {
        super(owner);
        this.battery = battery;
    }

    public void charging() {
        this.battery += 5;
    }

    public void movingCal() {
        if (this.battery < 1) {
            System.out.println("충전이 필요합니다.");
            return;
        }

        System.out.print("이동하면서");
        calculate();
        this.battery -= 1;
    }
}

class TabletNoteBook extends NoteBookComp {
    String regstPenModel;

    public TabletNoteBook(String owner, int battery, String regstPenModel) {
        super(owner, battery);
        this.regstPenModel = regstPenModel;
    }

    public void wrtie(String penInfo) {
        if (this.battery < 1) {
            System.out.println("충전이 필요합니다.");
            return;
        }

        if (this.regstPenModel.compareTo(penInfo) != 0) {
            System.out.println("등록된 펜이 아닙니다.");
            return;
        }

        System.out.println("필기 내용을 처리합니다.");
        this.battery -= 1;
    }
}

public class ISAInheritance {
    public static void main(String[] args) {
        NoteBookComp nc = new NoteBookComp("김승현", 5);
        TabletNoteBook tn = new TabletNoteBook("서소라", 5, "ISE-241-242");

        nc.movingCal();
        tn.wrtie("ISE-241-242");
    }
}
