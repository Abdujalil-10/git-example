package task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = ()->{
            for (int i = 0; i < 1000; i++) {
                counter.count();
            }
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

        Thread.sleep(2000);
        System.out.println(counter.getSum());
    }
}