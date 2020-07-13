package linkedlist;

import java.util.Scanner;

public class d1_ll_delete_every_k {
    public static Node delete(Node n, int k) {
        // write your code here.
        int count=0;
        Node nn = n;
        if(n==null)
            return n;
        Node prev = null;
        Node next = n.next;
        while(next!=null){
            count++;
            if(count%k==0){
                //delete
                if(prev==null){
                    n=n.next;
                    nn = n;
                    next = nn.next;
                    continue;
                }
                prev.next = next;
                nn = next;
                next = next.next;
                continue;
            }
            prev = nn;
            nn = next;
            next = next.next;
        }
        return n;
    }

    // -----------------------------------------------------

    static Node head1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1 = sc.nextInt();

        Node tail;
        head1 = tail = insert(null, a1);

        for (int i = 1; i < n1; i++) {
            int a = sc.nextInt();
            tail = insert(tail, a);
        }

        int k = sc.nextInt();

        head1 = delete(head1, k);
        display(head1);

    }

    // Class declaration for a Node of the Linked List
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    /*
     * Input Parameters: tail: tail of the linked list in which a new node is to
     * be inserted. data: the data value of the node which is to be inserted.
     *
     * Return Value: tail of the linked list/the node that is inserted
     */
    public static Node insert(Node tail, int data) {

        if (tail == null) {
            return new Node(data);
        }

        Node nn = new Node(data);
        tail.next = nn;
        return nn;
    }

    /*
     * Input Parameters: head: head of the linked list in which is to be
     * displayed.
     *
     * Return Value: null
     */
    public static void display(Node head) {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
    }
}
