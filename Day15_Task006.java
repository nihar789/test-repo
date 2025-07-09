public class Day15_Task006 {
    Day15_Task006Node root;

    public Day15_Task006() {
        this.root = null;
    }

    public void insert(int item) {
        root = insertNode(root, item);
    }

    private Day15_Task006Node insertNode(Day15_Task006Node root, int item) {
        if (root == null) {
            root = new Day15_Task006Node(item);
            return root;
        }

        if (item < root.item) {
            root.left = insertNode(root.left, item);
        } else if (item > root.item) {
            root.right = insertNode(root.right, item);
        }

        return root;
    }

    public Day15_Task006Node search(int key) {
        Day15_Task006Node current = root;
        while (current != null) {
            if (key == current.item) {
                return current;
            } else if (key < current.item) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Day15_Task006 bst = new Day15_Task006();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        Day15_Task006Node result = bst.search(40);
        if (result != null) {
            System.out.println("Found node with value " + result.item);
        } else {
            System.out.println("Node not found");
        }
    }
}
