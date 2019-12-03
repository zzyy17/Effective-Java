package effective.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String [] args) throws InterruptedException {
        //************************* prac1 ********************************//
        /*
        Thread t = new Thread(new printPrac1(3));
        t.start();
        System.out.println("[msg] The printing is over.");
         */

        //************************* prac2 ********************************//
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 50; i++) {
            executorService.execute(new fibonacciPrac2(i +1));
        }
        executorService.shutdown();

        //************************* prac3 ********************************//

    }
}
