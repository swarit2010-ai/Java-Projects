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
}