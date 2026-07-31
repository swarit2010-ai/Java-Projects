import java.util.*;
public class Traverse{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        for(int i = 1;i <= q.size();i++){
            int ele = q.remove();
            System.out.println(ele);
            q.add(ele);
        }
        System.out.println(q);
    }
}