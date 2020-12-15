package com.company;

public class Main {

    public static void main(String[] args) {
        Node head = null;
        for(int i=10; i>0; i--) {
            head = new Node(i, head);
        }

        printLinkedList(head);

        Node head1 = new Node(1, null);
        Node tail = head1;
        for(int i=2; i<=10; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }

        printLinkedList(head1);
    }

    private static void printLinkedList(Node head) {

        Node ref = head;

        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();

    }
}
