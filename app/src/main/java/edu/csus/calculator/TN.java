package edu.csus.calculator;

public class TN {
    String data;
    TN left;
    TN right;

    TN (String data){
        this.data = data;
        left = null;
        right = null;
    }
}
