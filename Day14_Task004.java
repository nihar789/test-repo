public class Day14_Task004 {
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

    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node in the list
        if (head == tail && head.data == data) {
            head = null;
            tail = null;
            return;
        }

        // If node to delete is head
        if (head.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node current = head;
        while (current.next != head) {
            if (current.next.data == data) {
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Node not found");
    }

    public static void main(String[] args) {
        Day14_Task004 list = new Day14_Task004();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before deletion:");
        list.traverse();
        list.deleteNode(30);
        System.out.println("After deletion:");
        list.traverse();
    }
}
