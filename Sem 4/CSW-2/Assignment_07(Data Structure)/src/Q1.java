// Create a class BSTNode that contains a member 'info' to store a number, with 'left' referring 
// to the left child and 'right' referring to the right child. Provide the necessary constructor. 
// Additionally, create a method to insert a node into a binary search tree



public class Q1 {
    static BSTNode insertNode(BSTNode root, BSTNode node) {
        if (root == null) {
            return node; 
        }
        if (node.info < root.info) {
            root.left = insertNode(root.left, node);
        } else if (node.info > root.info) {
            root.right = insertNode(root.right, node);
        }
        return root;
    }
    public static void main(String[] args) throws Exception {
       
        BSTNode node = new BSTNode(10);
        node = insertNode(node, new BSTNode(3));
        node = insertNode(node, new BSTNode(5));
        node = insertNode(node, new BSTNode(4));
        System.out.println(node.info);
       

        System.out.println(node.left.info);
        System.out.println(node.left.right.left.info);
        System.out.println(node.left.right.info);
    }
}
