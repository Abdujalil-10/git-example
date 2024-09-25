package task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    ;
    private AtomicInteger atomicInteger = new AtomicInteger();

    public void count() {
        atomicInteger.incrementAndGet();

    }

    public int getSum() {
        return atomicInteger.get();
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }
}
