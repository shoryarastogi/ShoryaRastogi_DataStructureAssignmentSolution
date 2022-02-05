package GradedCodingAssignment3.service;

public class BinaryToSkewedTree {
    public static Node node;
    public static Node prevNode = null;
    public static Node headNode = null;

    public static Node flattenBTToSkewed(Node root, int order) {

        if (root == null) {
            return new Node();
        }

        if (order > 0) {
            flattenBTToSkewed(root.right, order);
        } else {
            flattenBTToSkewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;

        if (headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        } else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        if (order > 0) {
            flattenBTToSkewed(leftNode, order);
        } else {
            flattenBTToSkewed(rightNode, order);
        }
        return  headNode;
    }

    public static void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }
}
