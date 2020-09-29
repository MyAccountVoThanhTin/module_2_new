package _12_java_collection_framework.optional.exercise;

public class Tree {
    static class Node {
        int element;
        Node left, right;

        public Node(int item) {
            this.element = item;
            left = right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.element) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.element);
                node.left = new Node(value);
            }
        } else if (value > node.element) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.element);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.element);
            traverseInOrder(node.right);
        }
    }

}
