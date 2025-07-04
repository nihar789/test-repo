public class Day14_Task003 {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void add(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            tail = toAdd;
            tail.next = head; // Point the tail to the head for circular linked list
            return;
        }
        tail.next = toAdd;
        tail = toAdd;
        tail.next = head; // Point the tail to the head for circular linked list
    }

    public void traverse() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        Day14_Task003 list = new Day14_Task003();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.traverse();
    }
}
