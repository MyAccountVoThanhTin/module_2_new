package _12_java_collection_framework.optional.exercise;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree.Node root = new Tree.Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.element);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
      //  tree.traverseInOrder(tree);
    }
}

