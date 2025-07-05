public class Day15_Task004 {
    public static void main(String[] args) {
        Day15_Task003 bst = new Day15_Task003();
        bst.insertRoot(8);
        bst.insertNode(3);
        bst.insertNode(10);
        bst.insertNode(1);
        bst.insertNode(6);
        bst.insertNode(14);
        bst.insertNode(4);
        bst.insertNode(7);
        bst.insertNode(13);
        System.out.println("Inorder traversal:");
        bst.printInorder(bst.root);
    }
}
