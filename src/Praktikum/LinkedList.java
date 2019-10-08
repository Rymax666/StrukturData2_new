package Praktikum;
/*
 *   @Rymaxxx
 *   Fuck Everyone Else !
 */

public class LinkedList {
    private Node head, tail = null;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    private void shortList() {
        Node current, index;
        int temp;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    void display() {
        shortList();
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }
}
