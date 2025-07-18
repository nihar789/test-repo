import java.util.LinkedList;
import java.util.Queue;

public class Day18_Task008 {
    public static Node createTree(int[] array, int index) {
        if (index >= array.length) return null;
        Node node = new Node(array[index]);
        node.left = createTree(array, 2 * index + 1);
        node.right = createTree(array, 2 * index + 2);
        return node;
    }

    public static void printLeftAndRightNodes(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean first = true;
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                if (i == 0 || i == levelSize - 1) {
                    if (!first) System.out.print(" ");
                    System.out.print(currentNode.data);
                    first = false;
                }
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Node root = createTree(array, 0);
        printLeftAndRightNodes(root);
    }
}
