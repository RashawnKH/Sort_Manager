package com.sparta.rashawn.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree implements BinaryTreeInterface{

    private final Node rootNode;
    private int numberOfElements = 1;
    private ArrayList<Integer> nodeValueList = new ArrayList<>();

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }


    @Override
    public int getRootElement() {

        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public void addElements(int[] elements) {
        for(int i = 1; i<elements.length; i++){
            addElement(elements[i]);
        }
    }

    public void addElement(final int element){
        addNodeToTree(rootNode, element);
        numberOfElements++;
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);

            if(value == node.getValue()){
                return true;
            }else{
                findElement(value);
            }
        return false;

    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.isLeftChildEmpty()){
            throw new ChildNotFoundException();
        }
        return node.getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.isRightChildEmpty()){
            throw new ChildNotFoundException();
        }
        return node.getRightChild().getValue();
    }

    @Override
    public int[] getSortedTreeAsc() {
        Node node = rootNode;
        Stack<Node> nodeStack = new Stack<>();
        int[] nodeArray = new int[numberOfElements];
        int i = 0;
        if (rootNode == null){
            return nodeArray;
        }

        while (node != null || !nodeStack.isEmpty()){
            while (node !=null) {
                nodeStack.push(node);
                node = node.getLeftChild();
            }
            node = nodeStack.pop();
            nodeArray[i++] = node.getValue();
            node = node.getRightChild();


        }
        return nodeArray;
    }




    @Override
    public int[] getSortedTreeDesc() {
        Node node = rootNode;
        Stack<Node> nodeStack = new Stack<>();
        int[] nodeArray = new int[numberOfElements];
        int i = 0;
        if (rootNode == null){
            return nodeArray;
        }

        while (node != null || !nodeStack.isEmpty()){
            while (node !=null) {
                nodeStack.push(node);
                node = node.getRightChild();
            }
            node = nodeStack.pop();
            nodeArray[i++] = node.getValue();
            node = node.getLeftChild();


        }
        return nodeArray;
    }



    public ArrayList getNodesFromTreeAsc(Node node)  {

        if (node == null){
            return nodeValueList;
        }
        getNodesFromTreeAsc(node.getLeftChild());
        nodeValueList.add(node.getValue());
        getNodesFromTreeAsc(node.getRightChild());

        return nodeValueList;
    }


    private void addNodeToTree(Node node, int element) {

        if (element <= node.getValue()){
            if(node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            }else{
                addNodeToTree(node.getLeftChild(), element);
            }
        }else if (element > node.getValue()){
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            }else{
                addNodeToTree(node.getRightChild(), element);
            }
        }

        if(element == node.getValue()) {
            return;
        }

    }



    public Node findNode(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()){
                return node;
            }

            if(element < node.getValue()){
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }


        return null;
    }

}
