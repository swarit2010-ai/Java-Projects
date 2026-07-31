import java.util.*;
public class AddRemovePeek {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        add(q,60,3);
        peek(q,3);
        remove(q,3);
        System.out.println(q);
    }
    static void add(Queue<Integer> q,int val,int idx){
        int n = q.size();
        if(idx < 0 || idx >= n){
            System.out.println("Error");
            return;
        }
        for(int i = 0;i < n;i++){
            if(i == idx) q.add(val);
            q.add(q.remove());
        }
    }
    static void peek(Queue<Integer> q,int idx){
        int n = q.size();
        if(idx < 0 || idx >= n){
            System.out.println("Error");
            return;
        }
        for(int i = 0;i < n;i++){
            if(i == idx) System.out.println(q.peek());
            q.add(q.remove());
        }
    }
    static void remove(Queue<Integer> q,int idx){
        int n = q.size();
        if(idx < 0 || idx >= n){
            System.out.println("Error");
            return;
        }
        for(int i = 0;i < n-1;i++){
            if(i == idx) q.remove();
            q.add(q.remove());
        }
    }
}
