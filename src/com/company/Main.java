package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> stk = new Stack<>();
        // push - запихнуть void push(Object obj)
        //top - показывает верхний объект стэка, но не удаляет его
        //pop - показывает верхний объект стэка и удаляет его
        stk.push("One");
        stk.push("Two");
        stk.push("Three");
        System.out.println(stk.pop());
        stk.push("Four");
        while(!stk.isEmpty())
        {
            System.out.println(stk.pop());
        }
        //four three two one
        //three four two one
        RecursiveFunctions.matrushki(7);
        System.out.println(RecursiveFunctions.fibonacci(120));
    }
}
