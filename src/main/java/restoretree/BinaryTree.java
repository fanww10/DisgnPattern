package main.java.restoretree;


public class BinaryTree {
    BinaryTree leftChildTree;
    BinaryTree rightChildTree;
    int value;

    public BinaryTree(){
        this(0);
    }

    public BinaryTree(int value) {
        this(value, null, null);
    }

    public BinaryTree(int value, BinaryTree leftChildTree, BinaryTree rightChildTree) {
        this.leftChildTree = leftChildTree;
        this.rightChildTree = rightChildTree;
        this.value = value;
    }
}
