public class Day15_Task001 {
    static class Node { //nstd cls node inside maincls
        int data;   //store calue
        Node left;  //ref of lft n rgt nde for crrnt node
        Node right;

        //          1
        //         /  \
        //        2    3

        Node(int data) {//cnstctr fr abv node cls
            this.data = data;// this takes int parameter to initialize data
        }
    }
}
