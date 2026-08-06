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
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
    }
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}