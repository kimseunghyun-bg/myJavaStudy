package chapter17.practice;

/**
 * Created by kimseunghyun on 2017-10-08.
 */

abstract class PersonalNumberStorage {
    public abstract void addPersonalInfo(String name, String perNum);

    public abstract String searchName(String perNum);
}

class PersonalNumInfo {
    private String name;
    private String number;

    public PersonalNumInfo(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

class PersonalNumberStorageImpl extends PersonalNumberStorage {

    private PersonalNumInfo[] perArr;
    private int numOfPerInfo;

    public PersonalNumberStorageImpl(int sz) {
        perArr = new PersonalNumInfo[sz];
        this.numOfPerInfo = 0;
    }

    @Override
    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo++] = new PersonalNumInfo(name, perNum);
    }

    @Override
    public String searchName(String perNum) {
        for (int i = 0; i < numOfPerInfo; i++) {
            if (perNum.compareTo(perArr[i].getNumber()) == 0) {
                return perArr[i].getName();
            }
        }
        return null;
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
        storage.addPersonalInfo("김기동", "950000-1122333");
        storage.addPersonalInfo("장산길", "970000-1122334");

        System.out.println(storage.searchName("950000-1122333"));
        System.out.println(storage.searchName("970000-1122334"));
    }
}
