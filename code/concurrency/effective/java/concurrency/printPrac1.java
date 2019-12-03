package effective.java.concurrency;

public class printPrac1 implements Runnable{

    private int cnt;
    public printPrac1(int cnt) {
        System.out.println("[msg] printing is starting....");
        this.cnt = cnt;
    }
    @Override
    public void run() {
        while(cnt-- > 0) {
            System.out.println("[Num]: The Number is " + (3 - cnt));
            Thread.yield();
        }
    }
}

