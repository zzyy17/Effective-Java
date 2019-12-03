package effective.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String [] args) throws InterruptedException, ExecutionException {
        //************************* prac1 page: 656********************************//
        /*
        Thread t = new Thread(new printPrac1(3));
        t.start();
        System.out.println("[msg] The printing is over.");
         */

        //************************* prac2 page: 656********************************//
        /*
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 50; i++) {
            executorService.execute(new FibonacciPrac2(i +1));
        }
        executorService.shutdown();
        */
        //************************* prac5 page: 659 ********************************//
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 30; i++) {
            System.out.println(executorService.submit(new FibonacciPrac5(i +1)).get());
        }
        executorService.shutdown();

    }
}
