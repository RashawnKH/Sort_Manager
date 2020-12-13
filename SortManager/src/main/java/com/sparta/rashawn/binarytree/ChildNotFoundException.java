package com.sparta.rashawn.binarytree;

public class ChildNotFoundException extends Exception{


    @Override
    public String getMessage() {
        return "This child does not exist in the tree";
    }
}
