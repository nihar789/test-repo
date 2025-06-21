//class Test extends Thread{
//}

public class TASKMT018 extends Thread{
    public void run(){
        System.out.println("thread started.");
    }
    public static void main(String args[]){

        TASKMT018 t1 = new TASKMT018();
        Thread th1 = new Thread(t1::run);
        th1.run();
//        t1.run1();
//        t1.start();
    }
}
