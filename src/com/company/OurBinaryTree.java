package com.company;

import com.sun.source.tree.BinaryTree;

import javax.swing.*;

public class OurBinaryTree {
    class Element {
        int value;
        Element left, right;// Содержат value, left, right

        // Element left = 5 (int)
        //
        public Element(int _value) {
            value = _value;
            left = right = null;
        }

    }

    public OurBinaryTree(int val)
    {
        root = new Element(val);
      //  root.value = val;
    }

    private Element root;

    // add
    public void add(int val){
        add(val, root);
    }

    private void add(int val, Element el){
        // final
        if(val<el.value && el.left == null)
            el.left = new Element(val);
        if(val>el.value && el.right == null)
            el.right = new Element(val);
        //find the place
        if (val < el.value)
            add(val, el.left);
        if(val>el.value)
            add(val, el.right);
    }
    //search
    public boolean search(int val)// non-recursive
    {
        return search(val, root);
    }
    private boolean search(int val, Element el)// recursive
    {
        //final
        if (el.value == val)
            return true;
        //else
        if (el.left!=null&& el.right!=null)
            return search(val, el.left)||search(val, el.right);
        if (el.left!=null)
            return search(val, el.left);
        if (el.right!=null)
            return search(val, el.right);
        //if (el.left==null&& el.right==null)
        return false;
    }

    public boolean binTreeSearch(int val)// non-recursive
    {
        return binTreeSearch(val, root);
    }
    private boolean binTreeSearch(int val, Element el)// recursive
    {
        //final
        if (el == null)
            return false;
        if (el.value == val)
            return true;

        //else
        if (val<el.value)
            // идти налево
            return binTreeSearch(val, el.left);
        if(val>el.value)
             //идти направо
            return binTreeSearch(val, el.right);
        return false;
    }

    public int smallest()
    {
        return smallest(root);
    }

    private int smallest(Element el)
    {
        if (el.left == null)
            return el.value;

        else
        return  smallest(el.left);
    }
}
