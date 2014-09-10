package com.example.MyExcercise;

/**
 * Created by adutta on 9/8/2014.
 */
public class BTreeTest {

    public Node root = null;

    public BTreeTest() {
        this.root = null;
    }

    public void addNode(int key, String value){
        if (root == null){
            root = new Node(key, value);
            return;
        }

        addToLeaf(root, key, value);
    }

    private void addToLeaf(Node currentNode, int key, String value){
        if (key > currentNode.key){ ///Then right node
            if (currentNode.getRight() != null){
                addToLeaf(currentNode.getRight(), key, value);
            }else {
                Node rightNode = new Node(key, value);
                currentNode.setRight(rightNode);
                return;
            }
        }else { // left node
            if (currentNode.getLeft() != null){
                addToLeaf(currentNode.getLeft(), key, value);
            }else{
                Node leftNode = new Node(key, value);
                currentNode.setLeft(leftNode);
                return;
            }
        };
    }

    public void printTree(Node node){
        System.out.println(node.getKey());
        if (node.getLeft() != null){
            printTree(node.getLeft());
        }

        if (node.getRight() != null){
            printTree(node.getRight());
        }

        return;
    }

    public class Node {

        private int key;
        private String value;

        private Node left;
        private Node right;

        public Node(int key, String value) {
            this.key = key;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public static void main(String[] args){
        BTreeTest bTreeTest = new BTreeTest();
        bTreeTest.addNode(100, "BOSS");
        bTreeTest.addNode(50, "VP1");
        bTreeTest.addNode(150, "VP2");
        bTreeTest.addNode(40, "mgr1");
        bTreeTest.addNode(41, "mgr2");


        bTreeTest.printTree(bTreeTest.root);
    }
}
