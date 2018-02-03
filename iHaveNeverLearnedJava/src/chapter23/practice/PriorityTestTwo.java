package chapter23.practice;

/**
 * Created by Seunghyun Kim on 2018-02-04
 */
class MessageSendingThread2 extends Thread {
    String message;

    public MessageSendingThread2(String message, int prio) {
        this.message = message;
        setPriority(prio);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(message + "(" + getPriority() + ")");
        }
    }
}

public class PriorityTestTwo {
    public static void main(String[] args) {
        MessageSendingThread3 tr1 = new MessageSendingThread3("First", Thread.MAX_PRIORITY);
        MessageSendingThread3 tr2 = new MessageSendingThread3("Second", Thread.NORM_PRIORITY);
        MessageSendingThread3 tr3 = new MessageSendingThread3("Third", Thread.MIN_PRIORITY);

        tr1.start();
        tr2.start();
        tr3.start();
    }
}
