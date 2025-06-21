class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo1 extends Thread {
    Counter7 counter;

    ThreadDemo1(Counter7 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println(i);
        }
    }
}

public class TASKMT005 {
    public static void main(String[] args) {
        Counter7 counter = new Counter7();
        ThreadDemo1 t1 = new ThreadDemo1(counter);
        ThreadDemo1 t2 = new ThreadDemo1(counter);

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
