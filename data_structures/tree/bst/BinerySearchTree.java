package com.datastructure.data_structures.tree.bst;

public class BinerySearchTree {

    private Node root;

    public BinerySearchTree() {
        this.root = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
            return;
        }

        Node currentNode = root;

        while (true){
            if(value < currentNode.value){
                if(currentNode.left == null){
                   currentNode.left = newNode;
                   return;
                }
                currentNode = currentNode.left;
            }

            if(value > currentNode.value){
                //right traversal'
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            }
        }
    }
    
    public Node lookup(int value){
        if(root != null) {
            Node currentNode = root;
            while (currentNode != null) {
                if (value < currentNode.value) {
                    currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                    currentNode = currentNode.right;
                } else if (value == currentNode.value) {
                    return currentNode;
                }
            }
        }
        return null;
    }

    int count = 0;
    public void printTree() {
        count = 0;
        printTree(root);
    }

    private void printTree(Node node) {
        System.out.print(node.value);
        System.out.println();
        count++;
        if(node.left != null) {
            String s = "\t";
           System.out.print("\t".repeat(Math.max(0, count)) + "Left: ");
            printTree(node.left);
        }
        if(node.right != null) {
            System.out.print("\t".repeat(Math.max(0, count)) +"Right: ");
            printTree(node.right);
        }
        count--;
    }
}
