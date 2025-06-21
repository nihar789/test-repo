class Counter6 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo2 extends Thread {
    Counter7 counter;

    ThreadDemo2(Counter7 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println(i);
        }
    }
}

public class TASKMT006 {
    public static void main(String[] args) {
        Counter7 counter = new Counter7();
        ThreadDemo3 t1 = new ThreadDemo3(counter);
        ThreadDemo3 t2 = new ThreadDemo3(counter);

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
