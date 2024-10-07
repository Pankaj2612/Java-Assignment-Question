// Write a program to add methods to the binary search tree created in Q1 for traversing the 
// tree in pre-order, in-order, and post-order. Invoke the above methods for execution

public class Q2 {
    public static void Preorder(BSTNode root) {
        if(root == null){
            return;
        }

        System.out.println(root.info);
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String[] args) {
        BSTNode root = new BSTNode(10);
        root.left = new BSTNode(3);
        root.left.left = new BSTNode(1);
        root.left.right = new BSTNode(4);
        root.right = new BSTNode(11);
        Preorder(root);
    }
}
