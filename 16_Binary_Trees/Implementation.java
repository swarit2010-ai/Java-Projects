import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node = node;
        this.level = level;
    }
}
public class Implementation{
    public static void main(String[] args) {
        //          1
        //      /      \
        //     2        3
        //    /  \    /  \
        //  4    5   6    7
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(level(a));
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println(pro(a));
        System.out.println(pro_non_zero(a));
        System.out.println(min(a));
        levelorder(a);
        System.out.println();
        levelorder_pattern(a);
        System.out.println();
        print_nth(a, 0, 2);
    }
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    static int sum(Node root){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    static int pro(Node root){
        if(root == null) return 1;
        return root.val*pro(root.left)*pro(root.right);
    }
    static int pro_non_zero(Node root){
        if(root == null) return 1;
        if(root.val != 0)
            return root.val*pro_non_zero(root.left)*pro_non_zero(root.right);
        else
            return pro_non_zero(root.left)*pro_non_zero(root.right);
    }
    static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    static int level(Node root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node peek = q.remove();
            System.out.print(peek.val + " ");
            if(peek.left != null) q.add(peek.left);
            if(peek.right != null) q.add(peek.right);
        }
    }
    static void levelorder_pattern(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currlevel = 0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair peek = q.remove();
            Node node = peek.node;
            int level = peek.level;
            if(level > currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(node.val + "  ");
            if(node.left != null) q.add(new Pair(node.left,level+1));
            if(node.right != null) q.add(new Pair(node.right,level+1));
        }
    }
    static void print_nth(Node root,int curr,int n){
        if(root == null) return;
        if(curr == n) {
            System.out.print(root.val + " ");
            return;
        }
        print_nth(root.left, curr+1, n);
        print_nth(root.right, curr+1, n);
    }
}