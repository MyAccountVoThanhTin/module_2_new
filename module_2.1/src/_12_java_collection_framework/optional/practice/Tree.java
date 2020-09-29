package _12_java_collection_framework.optional.practice;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();

}
