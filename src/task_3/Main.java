package task_3;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var set = ConcurrentHashMap.<Integer>newKeySet();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000; i++) {
                set.add(i);
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 1000; i < 2000; i++) {
                set.add(i);
            }
        };
        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start();
        th2.start();

        Thread.sleep(2000);
        System.out.println(set.size());
    }
}
