/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4stack.queue;

/**
 *
 * @author fifi2
 */
public class Stack {
   
    private Node top;
    private Node bottom;
    private int size ;
    
    
    public Stack() {
        top = null;
        bottom = null;
        size = 0;
    }

    public void push(int t) {
        Node newNode = new Node(t);
        newNode.setNext(top);
        top = newNode;
        this.size++ ;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        top = top.getNext();
        this.size--;
    }

    
    public boolean isEmpty() {
        return top == null;
    }

    
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        }
    }
}

  


