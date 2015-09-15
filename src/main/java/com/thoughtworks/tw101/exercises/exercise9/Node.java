package com.thoughtworks.tw101.exercises.exercise9;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;

    Node leftChild;
    Node rightChild;
    Node root;

    public Node(String name) {
        this.name = name;
        root = this;
    }

    public void add(String nameOfNewNode) {
        Node newNode = new Node(nameOfNewNode);
        if (root == null) { //if no root yet, make this the root
            root = newNode;
        } else {
            //set the starting node to traverse the tree
            Node currentNode = root;

            //created a future parent for the node
            Node parent;

            while (true) {
                parent = currentNode;    //start at the top parent and work way down recursively

                if (nameOfNewNode.compareTo(currentNode.name) > 0) { //check if new node is lower alphabetically than parent
                    //now focus on the left child
                    currentNode = currentNode.leftChild;
                    //check if the left child has children
                    if (currentNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }

            }

        }
    }

    public List<String> names() {
        List<String> alphabeticNames = new ArrayList<>();
        if (root != null) {

            if (root.rightChild != null) {
                alphabeticNames.addAll(root.rightChild.names());
                //root.leftChild.names();
            }
            alphabeticNames.add(root.name);

            if (root.leftChild != null) {
                alphabeticNames.addAll(root.leftChild.names());
                //root.leftChild.names();
            }

        }
        return alphabeticNames;
    }
}
