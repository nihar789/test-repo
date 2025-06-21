class Counter8 {
    private int count = 0;

    public static synchronized void increment() {
//        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo4 extends Thread {
    Counter8 counter;

    ThreadDemo4(Counter8 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println(i);
        }
    }
}

public class TASKMT008 {
    public static void main(String[] args) {
        Counter8 counter = new Counter8();
        ThreadDemo4 t1 = new ThreadDemo4(counter);
        ThreadDemo4 t2 = new ThreadDemo4(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
