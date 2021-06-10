package edu.csus.calculator;

public class Node {
    TN leaf;
    Node next;

    Node (TN leaf){
        this.leaf = leaf;
        next = null;
    }
}
