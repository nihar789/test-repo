public class Day14_Task10 {
    private int[] queue;
    private int front;
    private int rare;
    private int size;

    public Day14_Task10(int capacity){
        queue = new int[capacity];
        front=0;
        rare=0;
        size=0;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size == queue.length;
    }

    public void enqueue(int element){
        if (isFull()){
            System.out.println("Queue is full. Cannot add element.");
            return;
        }
        queue[rare]=element;
        rare=(rare+1)% queue.length;
        size++;
    }
    public int deque(){
        if (isEmpty()){
            System.out.println("Queue is Empty. Can not remove element.");
            return -1;
        }
        int element = queue[front];
        front=(front+1);
        size--;
        return element;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return;
        }
        int temp = front;
        for (int i=0; i<size; i++){
            System.out.print(queue[temp]+" ");
            temp=(temp+1)%queue.length;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Day14_Task10 queue1 = new Day14_Task10(5);
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.display();

        System.out.println("Peek: "+queue1.peek());
        queue1.deque();
        queue1.display();
    }
}
