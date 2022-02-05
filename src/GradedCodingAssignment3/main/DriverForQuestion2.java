package GradedCodingAssignment3.main;

import GradedCodingAssignment3.service.Node;

import static GradedCodingAssignment3.service.BinaryToSkewedTree.flattenBTToSkewed;
import static GradedCodingAssignment3.service.BinaryToSkewedTree.traverseRightSkewed;

public class DriverForQuestion2 {

    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(3);
        node.left.left = new Node(1);
        node.right = new Node(6);
        node.right.right =new Node(7);

        int order = 0;
        Node headNode = flattenBTToSkewed(node, order);
        traverseRightSkewed(headNode);
    }
}
