import java.util.Queue;
public class Pro_03 {
    public static void main(String[] args) {
    }
    public void enqueue(Queue<Integer> q, int x) {
        // code here
        q.add(x);
    }
    public void dequeue(Queue<Integer> q) {
        q.remove();
        // code here
    }
    public int front(Queue<Integer> q) {
        // code here
        return q.peek();
    }
    public boolean find(Queue<Integer> q, int x) {
        // code here
        boolean check = false;
        for(int i = 0;i < q.size();i++){
            if(q.peek() == x) check = true;
            q.add(q.remove());
        }
        return check;
    }
}
