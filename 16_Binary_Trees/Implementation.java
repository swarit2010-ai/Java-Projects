class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Implementation{
    public static void main(String[] args) {
        //        10
        //      /    \
        //     20     30
        //    /  \   /   \
        //  40   50 60   70
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
        return 0;
    }
    static int pro_non_zero(Node root){
        return 0;
    }
    static int min(Node root){
        return 0;
    }
    static int level(Node root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
}