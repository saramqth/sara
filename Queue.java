/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4stack.queue;

/**
 *
 * @author fifi2
 */
public class Queue {
    
    private Node head;
    private Node tail;
    private int size;
    
    
    public void enqueue(int num) {
        Node newNode = new Node(num);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        this.size++;
    }

    
    public void dequeue() {
        if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
      
    }

    
    public void printQueue() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

