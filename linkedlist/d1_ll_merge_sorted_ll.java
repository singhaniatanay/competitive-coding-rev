package linkedlist;

import java.util.Scanner;

public class d1_ll_merge_sorted_ll {
    public static Node mergeKList(Node []arr, int k){
        // write your code here.
        Node res = null;
        Node res_t = null;
        boolean trigger = true;
        while (trigger){
            int min_key=0;
            for(int i=0;i<k;i++){
                if(arr[min_key]==null){
                    min_key =i;
                }
                if(arr[i]==null){
                    continue;
                }
                int min_dat = arr[min_key].data;
                int curr_dat = arr[i].data;
                if(curr_dat<min_dat){
                    min_key = i;
                }
            }
            if(arr[min_key]==null){
                trigger = false;
                continue;
            }
            int min_data = arr[min_key].data;
            arr[min_key] = arr[min_key].next;
            if(res==null){
                res = new Node(min_data);
                res_t = res;
            }else{
                res_t.next = new Node(min_data);
                res_t = res_t.next;
            }
        }
        return res;
    }

    // -----------------------------------------------------


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Node[] arr = new Node[k];

        Node start = null;
        Node curr = null;

        for(int i=0; i < k; i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            start = new Node(a);
            arr[i] = start;

            curr = start;
            for(int j = 1; j < n; j++){
                Node ptr = new Node(sc.nextInt());
                curr.next = ptr;
                curr = ptr;
            }
            curr.next = null;
            start = null;
        }

        Node res = mergeKList(arr, k);
        display(res);

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
