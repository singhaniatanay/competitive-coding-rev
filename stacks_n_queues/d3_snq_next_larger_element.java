package stacks_n_queues;

import java.util.Scanner;
import java.util.Stack;

public class d3_snq_next_larger_element {
    static class stack
    {
        int top;
        int[] items = new int[100];

        // Stack functions to be used by printNGE
        void push(int x)
        {
            if (top == 99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top] = x;
            }
        }

        int pop()
        {
            if (top == -1)
            {
                System.out.println("Underflow error");
                return -1;
            }
            else
            {
                int element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty()
        {
            return (top == -1);
        }
    }

    /* prints element and NGE pair for
    all elements of arr[] of size n */
    static void printNGE(int[] arr, int n)
    {
        Stack<Integer> indexes = new Stack<>();
        int[] res = new int[arr.length];
        for (int i = 0; i <res.length ; i++) {
            res[i] = -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(indexes.isEmpty()){
                indexes.push(i);
                continue;
            }
            while (!indexes.isEmpty() && arr[indexes.peek()]<arr[i]){
                int in = indexes.pop();
                res[in] = arr[i];
            }
            indexes.push(i);
        }
        for(int i:res){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args)
    { 	  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        printNGE(arr, n);
    }
}
