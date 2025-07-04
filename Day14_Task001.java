public class Day14_Task001 {
    class node{
        int data;
        node next;


        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private node head;

    public void add(int data){
        node toadd=new node(data);
        if (head==null){
            head=toadd;
            return;
        }
        node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=toadd;
    }
    public void traverse(){
        node current = head;
        while (current!=null){
            System.out.print(current.data+" "+"->");
            current=current.next;
        }
        System.out.println("null");
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
