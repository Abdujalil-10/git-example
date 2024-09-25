package task_2;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {
    public static void main(String[] args) {
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(1000);
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                atomicIntegerArray.set(i, i);
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            System.out.println("index " + i + "  " + atomicIntegerArray.get(i));
        }
    }
}
