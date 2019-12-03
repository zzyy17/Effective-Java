package effective.java.concurrency;

public class FibonacciPrac2 implements Runnable {

    private int n;
    private boolean isUse = false;
    public FibonacciPrac2() {}
    public FibonacciPrac2(int n) {
        this.n = n;
    }

    public void helper() {
        int pre = 1, p = 1;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                System.out.print(1 + ", ");
                continue;
            }
            if (i == n - 1) {
                System.out.print(pre + p);
                continue;
            }
            System.out.print(pre + p + ", ");
            int temp = pre;
            pre = p;
            p = temp + p;
        }
        System.out.println();
    }
    @Override
    public void run() {
        System.out.print("[Array]: ");
        helper();
    }
}
