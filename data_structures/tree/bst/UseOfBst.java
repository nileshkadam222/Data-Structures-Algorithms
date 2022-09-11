package com.datastructure.data_structures.tree.bst;

public class UseOfBst {

    public static void main(String[] args) {
        BinerySearchTree tree = new BinerySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(20);
        tree.insert(1);
        tree.insert(6);
        tree.insert(15);
        tree.insert(170);
        System.out.println(tree.lookup(2));
        //tree.printTree();

    }
}
