package chpater20.quiz;

/**
 * Created by kimseunghyun on 2017-11-04.
 */
public class AboutStaticWrapping {
    public static void main(String[] args) {
        Integer iValue1 = Integer.valueOf(10);
        Integer iValue2 = Integer.valueOf(10);

        if (iValue1 == iValue2) {
            System.out.println("iValue1과 iValue2는 동일 인스턴스 참조");
        } else {
            System.out.println("iValue1과 iValue2는 다른 인스턴스 참조");
        }
    }
}
