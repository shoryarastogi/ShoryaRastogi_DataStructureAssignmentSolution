package GradedCodingAssignment3.service;

public class Node {
    public int val;
    public Node left, right;

    public Node() {
        left = right = null;
    }

    public Node(int item) {
        val = item;
        left = right = null;
    }
}
