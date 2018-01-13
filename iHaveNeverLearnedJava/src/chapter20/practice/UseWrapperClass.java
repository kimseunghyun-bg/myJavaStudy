package chpater20.practice;

/**
 * Created by kimseunghyun on 2017-11-04.
 */
public class UseWrapperClass {
    public static void showData(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Integer intInst = new Integer(3);
        showData(intInst);
        showData(new Integer(7));
    }
}
