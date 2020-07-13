package linkedlist;

import java.util.Scanner;

public class d1_ll_inplace_rearrange {
    public static Node rearrange(Node head) {
        // write your code here.
        Node cpy = copy(head);
        Node rev = reverse(cpy);

        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            Node temp = slow.next;
            Node temp2 = rev.next;
            slow.next = rev;
            rev.next = temp;
            slow = temp;
            rev = temp2;
        }
        slow.next = null;
        rev.next = null;
        return head;
    }
    public static Node copy(Node head){
        Node c = new Node(head.data);
        Node c_head = c;
        head = head.next;
        while(head!=null){
            c.next = new Node(head.data);
            c = c.next;
            head = head.next;
        }
        return c_head;
    }
    public static Node reverse(Node head){
        Node curr = head;
        if(head==null)
            return head;
        Node prev= null;
        Node next = head.next;
        while (next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;

        return curr;
    }

    //

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

        head1 = rearrange(head1);
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
     * Input Parameters: tail: head of the linked list in which a new node is to
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
