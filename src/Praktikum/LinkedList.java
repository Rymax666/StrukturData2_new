package Praktikum;
/*
 *   @Rymaxxx
 *   Fuck Everyone Else !
 */
public class LinkedList {
    private Node head, tail = null;

    void insert(int data) {
        //buat node baru
        Node newNode = new Node(data);

        //jika list kosong
        if (head == null) {
            //head dan tail mengarah ke node baru (newNode)
            head = tail = newNode;
            //head prev mengarah ke null
            head.prev = null;
            //tail next mengarah ke null sampai node list yang terakir
            tail.next = null;
        } else {
            //node baru akan di tambahkan setelah tail, tail next akan mengarah ke node yang baru(newNode)
            tail.next = newNode;
            //node baru yang sebelumnya akan mengarah ke tail
            newNode.prev = tail;
            //node baru akan menjadi tail
            tail = newNode;
            //seperti biasa node baru akan mengarah ke null
            tail.next = null;
        }
    }

    private void shortList() {
        Node current, index;
        int temp;
        //current diarahkan ke head
        for (current = head; current.next != null; current = current.next) {
            //index akan mengarahkan node next ke current
            for (index = current.next; index != null; index = index.next) {
                //jika data sebelumnya (current.data) lebih besar, maka data sebelumnya akan dibalik
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
        //node sebelumnya mengarah ke head
        Node current = head;
        while (current != null) {
            //ngeprint setiap node
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }
}
