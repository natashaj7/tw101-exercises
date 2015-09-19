package com.thoughtworks.tw101.exercises.exercise9;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;

    private Node leftChild;
    private Node rightChild;
    private Node root;

    public Node(String name) {
        this.name = name;
        root = this;
    }

    public void add(String nameOfNewNode) {
        Node newNode = new Node(nameOfNewNode);
        if (root == null) { //if no root yet, make this the root
            root = newNode;
        } else {
            //this will be the focus node
            Node currentNode = root;
            //the new node will be the child node of this parent
            Node parent = currentNode;
            //start at the top parent and work way down recursively
            if (nameOfNewNode.compareTo(currentNode.name) > 0) { //check if new node is lower alphabetically than parent
                //move down to the left child
                currentNode = currentNode.leftChild;
                //check if the left child is empty
                if (currentNode == null) {
                    //assign the newNode its parent
                    parent.leftChild = newNode;
                } else {
                    parent.leftChild.add(nameOfNewNode);
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parent.rightChild = newNode;
                } else {
                    parent.rightChild.add(nameOfNewNode);
                }
            }

        }
    }

    public List<String> names() {
        List<String> alphabeticNames = new ArrayList<>();
        if (root != null) {

            if (root.rightChild != null) {
                alphabeticNames.addAll(root.rightChild.names());
            }
            alphabeticNames.add(root.name);

            if (root.leftChild != null) {
                alphabeticNames.addAll(root.leftChild.names());
            }

        }
        return alphabeticNames;
    }
}
