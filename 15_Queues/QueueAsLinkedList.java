class Node{
    Node next;
    int val;
    Node(int val) {
        this.val = val;
    }
}
class MYQueue{
    Node head;
    Node tail;
    int size = 0;
    void add(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int remove(){
        int ele;
        if(head == null){
            System.out.println("Error");
            return -1;
        }
        else{
            ele = head.val;
            head = head.next;
        }
        size--;
        return ele;
    }
    int peek(){
        return head.val;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class QueueAsLinkedList {
    public static void main(String[] args) {
        MYQueue q = new MYQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.add(q.remove());
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        q.display();
    }
}
