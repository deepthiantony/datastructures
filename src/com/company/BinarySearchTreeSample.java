package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    BSTNode(int data) {
        this.data = data;
        right = null;
        left = null;
    }
}

class BST {
    BSTNode root;

    public void addNew(int data) {
        this.root = recursiveAdd(this.root, data);
    }

    public BSTNode recursiveAdd(BSTNode current, int data) {
        if (current == null) {
            return (new BSTNode(data));
        } else {
            if (current.data > data) {
                current.left = recursiveAdd(current.left, data);
            } else if (current.data < data) {
                current.right = recursiveAdd(current.right, data);
            }
        }
        return current;

    }

    public void delete(int data) {
        this.root = recursiveDelete(this.root, data);
    }

    public BSTNode recursiveDelete(BSTNode current, int data) {
        if (current == null) {
            return null;
        } else {
            if (current.data < data) {
                current.right = recursiveDelete(current.right, data);
            } else if (current.data > data) {
                current.left =recursiveDelete(current.left,data);
            }
            else{
                if(current.left==null && current.right==null){
                    return null;
                }
                else if(current.right==null){
                    return current.left;
                }
                else if(current.left==null){
                    return current.right;
                }
                else{
                    current.data= findMinNode(current);
                    recursiveDelete(current.right, data);
                }
            }
        }

        return current;
    }
    public int findMinNode(BSTNode current){

return current.data;
    }
    public void traverseInorderBST(BSTNode current){
        if(current!=null){
            traverseInorderBST(current.left);
            System.out.println(current.data);
            traverseInorderBST(current.right);
        }
    }
    public void BreadthFirstSearch(BSTNode current){
        Queue<BSTNode> nodes=new LinkedList<>() ;
        if(current==null)   {
            return;
        }
        nodes.add(current);
        while(current!=null){
           BSTNode node= nodes.remove();
            System.out.println(node.data);
            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }


    }

}

public class BinarySearchTreeSample {
    public static void main(String args[]) {
        BST tree = new BST();
        tree.addNew(3);
        tree.addNew(2);
        tree.addNew(1);
        tree.addNew(5);
        tree.addNew(4);
        tree.addNew(6);
        tree.addNew(7);
        tree.delete(9);
        //tree.traverseInorderBST(tree.root);
        tree.traverseInorderBST(tree.root);
    }


}
