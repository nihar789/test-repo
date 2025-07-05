class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}
class BinarySearchTreeOp {
    TreeNode root;

    void insert(int value) {                       // 10             // 50
        root = insertVal(root, value);		//root is null = insertval(null, 10)// root is 10 = insertval(10, 50)//root is 50 =  /// 10, 40
    }
    TreeNode insertVal(TreeNode node, int value) { // null, 10              //10,50
        if (node == null) {			//node = null T        //
            node = new TreeNode(value);	//node = 10
            return node;
        }
        if (value < node.value) {			//50 < 10 F // 40 <10 F
            node.left = insertVal(node.left, value);
        } else if (value > node.value) {		//50 >10 T // 40 > 10 T
            node.right = insertVal(node.right, value); //add of right ,50  ==> 
        }
        return node;
    }
    void inorder() {
        inorderVal(root);
    }

    void inorderVal(TreeNode node) {
        if (node != null) {
            inorderVal(node.left);
            System.out.print(node.value + " ");
            inorderVal(node.right);
        }
    }
}

public class Node {
    public static void main(String[] args) {
        BinarySearchTreeOp bstobj = new BinarySearchTreeOp();
        bstobj.insert(10);  //===> root
        bstobj.insert(50);
        bstobj.insert(40);
        bstobj.insert(70);
        bstobj.insert(5);
        System.out.println("here is the code for in order traversal of Binary search tree ");
        bstobj.inorder();
    }
}
