package chapter22.quiz;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kimseunghyun on 2018-01-27.
 */
class MenuChoiceException extends Exception {
    public MenuChoiceException(int choice) {
        super(choice + "에 해당하는 선택은 존재하지 않습니다.");
    }
}

interface INIT_MENU {
    //TODO interface2Enum
    int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

interface INPUT_SELECT {
    //TODO interface2Enum
    int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

class PhoneInfo {
    private String name;
    private String phoneNumber;

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void showPhoneInfo() {
        System.out.println("name : " + this.name);
        System.out.println("phone : " + this.phoneNumber);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "name='" + name + "\'" + ", phoneNumber='" + phoneNumber + "\'";
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((PhoneInfo) obj).getName());
    }
}

class PhoneUnivInfo extends PhoneInfo {
    private String major;
    private String year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, String year) {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    @Override
    public void showPhoneInfo() {
        super.showPhoneInfo();
        System.out.println("major : " + this.major);
        System.out.println("year : " + this.year);
    }

    @Override
    public String toString() {
        return super.toString() + "major='" + major + "\'" + ", year='" + year + "\'";
    }
}

class PhoneCompanyInfo extends PhoneInfo {
    private String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    public void showPhoneInfo() {
        super.showPhoneInfo();
        System.out.println("company : " + this.company);
    }

    @Override
    public String toString() {
        return super.toString() + "company='" + company + "\'";
    }
}

class PhoneBookManager {
    private HashSet<PhoneInfo> infoStorage = new HashSet<>();

    private PhoneBookManager() {
    }

    static PhoneBookManager inst = null;

    public static PhoneBookManager createManagerInst() {
        if (inst == null) {
            inst = new PhoneBookManager();
        }
        return inst;
    }

    public void inputData(PhoneInfo phoneInfo) {
        this.infoStorage.add(phoneInfo);
    }

    public void searchData(String name) {
        PhoneInfo phoneInfo = search(name);

        if (phoneInfo == null) {
            return;
        }
        phoneInfo.showPhoneInfo();
    }

    public void deletePhoneInfo(String name) {
        PhoneInfo phoneInfo = search(name);

        if (phoneInfo == null) {
            return;
        }
        this.infoStorage.remove(phoneInfo);
    }

    private PhoneInfo search(String name) {
        for (PhoneInfo phoneInfo : this.infoStorage) {
            if (phoneInfo.getName().compareTo(name) == 0) {
                return phoneInfo;
            }
        }
        return null;
    }
}

class MenuViewer {
    public static void showMenu() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택 : ");
    }
}

public class PhoneBookVer07 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = PhoneBookManager.createManagerInst();
        while (true) {
            MenuViewer.showMenu();

            try {
                int choice = scanner.nextInt();
                if (choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT) {
                    throw new MenuChoiceException(choice);
                }
                scanner.nextLine();

                switch (choice) {
                    case INIT_MENU.INPUT:
                        System.out.println("데이터 입력을 시작합니다..");

                        System.out.println("1. 일반, 2. 대학, 3. 회사");

                        int typeNum = scanner.nextInt();
                        scanner.nextLine();
                        if (typeNum < INPUT_SELECT.NORMAL || typeNum > INPUT_SELECT.COMPANY) {
                            throw new MenuChoiceException(typeNum);
                        }

                        System.out.print("이름 : ");
                        String name = scanner.nextLine();
                        System.out.print("전화번호 : ");
                        String phone = scanner.nextLine();
                        if (typeNum == INPUT_SELECT.NORMAL) {
                            phoneBookManager.inputData(new PhoneInfo(name, phone));
                        } else if (typeNum == INPUT_SELECT.UNIV) {
                            System.out.print("전공 : ");
                            String major = scanner.nextLine();
                            System.out.print("학년 : ");
                            String year = scanner.nextLine();
                            phoneBookManager.inputData(new PhoneUnivInfo(name, phone, major, year));
                        } else if (typeNum == INPUT_SELECT.COMPANY) {
                            System.out.print("회사 : ");
                            String company = scanner.nextLine();
                            phoneBookManager.inputData(new PhoneCompanyInfo(name, phone, company));
                        }
                        System.out.println("데이터 입력이 완료되었습니다.");
                        break;

                    case INIT_MENU.SEARCH:
                        System.out.println("데이터 검색을 시작합니다..");

                        System.out.print("이름 : ");
                        String searchName = scanner.nextLine();
                        phoneBookManager.searchData(searchName);

                        System.out.println("데이터 검색이 완료되었습니다.");
                        break;

                    case INIT_MENU.DELETE:
                        System.out.println("데이터 삭제를 시작합니다..");

                        System.out.print("이름 : ");
                        String deleteName = scanner.nextLine();
                        phoneBookManager.deletePhoneInfo(deleteName);

                        System.out.println("데이터 삭제가 완료되었습니다.");
                        break;

                    case INIT_MENU.EXIT:
                        System.out.println("프로그램 종료...");
                        return;

                    default:
                        System.out.println("1 ~ 4 까지 숫자를 입력해주세요.");
                        break;
                }
            } catch (MenuChoiceException e) {
                System.out.println(e.getMessage());
                System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
                continue;
            }
        }
    }
}

