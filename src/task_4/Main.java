package task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable1 = () -> {
            for (int i = 0; i < 100; i++) {
                integers.add(i);
            }
        };

        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                int a = random.nextInt(100);
                synchronized (integers) {
                    if (a < integers.size()) {
                        System.out.println("index " + a + ": " + integers.get(a));
                        integers.set(a, random.nextInt(100, 200));
                        System.out.println("index " + a + ": Changed value is " + integers.get(a));
                        System.out.println("index " + a + " value removed. Removed value was " + integers.remove(a));
                        System.out.println("integers.size() = " + integers.size());
                    }
                }
            }
        };

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);
        Thread th3 = new Thread(runnable2);

        th1.start();
        Thread.sleep(1000);
        th2.start();
        th3.start();


    }
}
