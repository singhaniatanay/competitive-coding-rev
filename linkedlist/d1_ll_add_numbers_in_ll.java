package linkedlist;

import java.util.Scanner;

public class d1_ll_add_numbers_in_ll {
    public static Node addTwoNumbers(Node n1, Node n2) {
        // write your code here.
        Node rev1 = reverse(n1);
        Node rev2 = reverse(n2);
        Node temp1 = rev1;
        Node temp2 = rev2;
        Node res = null;
        Node temp3 = null;
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int newdata = temp1.data +temp2.data+carry;
            int d = newdata%10;
            carry = (newdata - d)/10;
            Node curr = new Node(d,null);
            if(res==null){
                res = curr;
                temp3 = res;
            }else{
                temp3.next = curr;
                temp3 = temp3.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp2!=null){
            int newdata = temp2.data+carry;
            int d = newdata%10;
            carry = (newdata - d)/10;
            Node curr = new Node(d,null);
            if(res==null){
                res = curr;
                temp3 = res;
            }else{
                temp3.next = curr;
                temp3 = temp3.next;
            }
            temp2 = temp2.next;
        }
        while(temp1!=null){
            int newdata = temp1.data+carry;
            int d = newdata%10;
            carry = (newdata - d)/10;
            Node curr = new Node(d,null);
            if(res==null){
                res = curr;
                temp3 = res;
            }else{
                temp3.next = curr;
                temp3 = temp3.next;
            }
            temp1 = temp1.next;
        }

        Node orginal = reverse(res);
        if(carry!=0){
            Node newhead = new Node(carry,null);
            newhead.next = orginal;
            return newhead;
        }
        return orginal;
    }
    public static Node reverse(Node head){
        if(head==null)
            return null;

        Node prev = null;
        Node curr = head;
        Node next = head.next;
        while(next!=null){
            curr.next = prev;
            prev= curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

    // -----------------------------------------------------

    static Node head1;

    static Node head2;

    static Node head3;

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

        int n2 = sc.nextInt();
        int a2 = sc.nextInt();

        head2 = tail = insert(null, a2);

        for (int i = 1; i < n2; i++) {
            int a = sc.nextInt();
            tail = insert(tail, a);
        }

        head3 = addTwoNumbers(head1, head2);
        display(head3);

    }

    // Class declaration for a Node of the Linked List
    private static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
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
            return new Node(data, null);
        }

        Node nn = new Node(data, null);
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
        System.out.println();
    }
}
