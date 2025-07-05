public class Day15_Task002 {
    Node root;//refers to root in the Binary Search tree as requested by Meher

    static class Node {//each cde hs int & refers to its child in the left and right
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertRoot(int data) {//creating root
        root = new Node(data);
    }

    public void insertNode(int data) {//
        if (root == null) {
            insertRoot(data);
        } else {
            insert(data, root);
        }
    }

    private void insert(int data, Node node) {      //8
        if (data < node.data) {
            if (node.left == null) {
                node.left = new Node(data);
            } else {
                insert(data, node.left);
            }
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = new Node(data);
            } else {
                insert(data, node.right);
            }
        }
        //          8
        //         /  \
        //        3    10
        //      /   \   \
        //     1     6   14
        //           /    /
        //          4     13
        //          /
        //         7
    }
}
