package effective.java.concurrency;

import java.util.concurrent.Callable;

public class FibonacciPrac5 implements Callable<String>{

    private int n;
    private boolean isUse = false;
    public FibonacciPrac5() {}
    public FibonacciPrac5(int n) {
        this.n = n;
    }

    public void helper() {
        int pre = 1;
        int p = 1;
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
    public String call() throws Exception {
        System.out.print("[Array]: ");
        helper();
        return "[msg]: Done.";
    }
}
