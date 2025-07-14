public class Day17_AVLTreeCreation {
    class Node {
        int key;
        Node left;
        Node right;
        int height;

        Node(int key) {
            this.key = key;
            this.height = 1;
        }
    }

    Node root;

    int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    void updateHeight(Node node) {
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        if (leftHeight > rightHeight) {
            node.height = leftHeight + 1;
        } else {
            node.height = rightHeight + 1;
        }
    }

    int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    Node rightRotate(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        updateHeight(node);
        updateHeight(temp);
        return temp;
    }

    Node leftRotate(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        updateHeight(node);
        updateHeight(temp);
        return temp;
    }

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        updateHeight(node);
        int balance = getBalance(node);
        if (balance > 1) {
            if (key < node.left.key) {
                return rightRotate(node);
            } else {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balance < -1) {
            if (key > node.right.key) {
                return leftRotate(node);
            } else {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    void insert(int key) {
        root = insert(root, key);
    }

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    void display() {
        inorderTraversal(root);
    }

    public static void main(String[] args) {
        Day17_AVLTreeCreation tree = new Day17_AVLTreeCreation();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);
        System.out.println("Inorder traversal:");
        tree.display();
    }
}