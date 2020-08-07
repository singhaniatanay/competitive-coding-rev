package trees;

import java.util.ArrayDeque;
import java.util.Scanner;

public class d8_add_one_row_to_tree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 0)
            return root;
        else if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }

        addOneRow_(root, v, d, 1);
        return root;

    }

    private static void addOneRow_(TreeNode root, int v, int d, int level) {
        if (root == null) {
            return;
        }
        if (level >= d) {
            return;
        }

        if (level == d - 1) {
            TreeNode temp = root.left;
            root.left = new TreeNode(v);
            root.left.left = temp;

            TreeNode temp2 = root.right;
            root.right = new TreeNode(v);
            root.right.right = temp2;
        } else {
            addOneRow_(root.left, v, d, level + 1);
            addOneRow_(root.right, v, d, level + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, d;
        String line1 = sc.nextLine().trim();
        String line2 = sc.nextLine().trim();
        Integer[] vd=inputSplitSpace(line1);
        v=vd[0];d=vd[1];
        Integer[] treeArr = inputSplitSpace(line2);
        TreeNode root = createTree(treeArr);
        TreeNode res=addOneRow(root, v, d) ;
        display(res);


    }

    // utility function to display a binary tree.
    public static void display(TreeNode node) {
        if (node == null) {
            return;
        }

        String str = "";

        str += node.left == null ? "." : node.left.val;
        str += " <= " + node.val + " => ";
        str += node.right == null ? "." : node.right.val;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // utility function, don''t change its code
    public static Integer[] inputSplitSpace(String str) {
        String[] sArr = str.split(" ");
        Integer[] arr = new Integer[sArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
        }
        return arr;
    }

    // utility function to create a tree, don''t change its code.
    public static TreeNode createTree(Integer[] arr) {
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        TreeNode root = new TreeNode(arr[0]);
        que.addLast(root);
        int i = 1;
        while (!que.isEmpty() && i < arr.length) {
            TreeNode nn = que.removeFirst();

            if (i < arr.length && arr[i] != null) {
                TreeNode n = new TreeNode(arr[i]);
                nn.left = n;
                que.addLast(n);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                TreeNode n = new TreeNode(arr[i]);
                nn.right = n;
                que.addLast(n);
            }
            i++;
        }

        return root;
    }
}
