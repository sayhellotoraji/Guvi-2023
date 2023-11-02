package CustomStack;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Driver Code
class CustomStack {

    // Count variable stores stack size
    private static int count = 0;

    // Top position in stack
    private static Node topNode = null;

    // Constructor
    public CustomStack() {
    }

    public static int getCount() {
        return CustomStack.count;
    }

    public static void setCount(int count) {
        CustomStack.count = count;
    }

    // Peek Operation
    // Only Returns the top element but does not remove it
    public static Node getTopNode() {
        return CustomStack.topNode;
    }

    public static void setTopNode(Node tempNode) {
        CustomStack.topNode = tempNode;
    }

    // Push operation - Add element to top of stack
    public static void push(Integer data) {
        Node tempNode = new Node(data);
        tempNode.setBelowNode(CustomStack.topNode);
        CustomStack.setTopNode(tempNode);
        CustomStack.setCount(count + 1);

    }

    // Pop Operation - Remove the top element from the stack
    public static void pop() {
        System.out.println("\nPopped Node: " + CustomStack.topNode.getData());
        CustomStack.setTopNode(CustomStack.topNode.getBelowNode());
        CustomStack.setCount(count - 1);
    }

    // Method to print elements in stack
    public static void printStack() {
        Node top = CustomStack.topNode;
        if (top == null) {
            System.out.println("No element in stack to print");
            return;
        }
        while (top != null) {
            System.out.println(top.getData());
            top = top.getBelowNode();
        }
    }

    // Check if Stack is Empty
    public static boolean isEmpty() {
        return CustomStack.count == 0;
    }

    public static int size() {
        return CustomStack.count;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be pushed into stack:");
        int no_of_elements = Integer.parseInt(sc.nextLine());

        // Adding element to top of the stack
        for (int i = 1; i <= no_of_elements; i++) {
            System.out.println("Enter element -> " + i);
            int data = Integer.parseInt(sc.nextLine());

            // 1. Push operation
            CustomStack.push(data);
        }

        // 2. Print after adding all elements
        System.out.println("\nElements in Stack After Push operation:");
        CustomStack.printStack();

        // 3. Pop top element from stack
        CustomStack.pop();
        System.out.println("Elements in Stack After Pop operation:");

        // Print after poping an element from stack
        printStack();

        // 4. Check if Stack is Emtpy or not
        System.out.println("\nIs Stack Empty: " + CustomStack.isEmpty());

        // 5. Print size of the stack
        System.out.println("\nSize of stack: " + CustomStack.size());

        sc.close();
    }
}