class ArrayQueue{
    int[] q;
    int size = 0;
    int f;
    int r;
    ArrayQueue(int n) {
        q = new int[n];
    }
    void add(int val){
        if(size == q.length){
            System.out.println("Queue is full");
        }
        else{
            q[r++] = val;
            if(r == q.length) r = 0;
            size++;
        }
    }
    int remove(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int ele = q[f];
        f++;
        if(f == q.length) f = 0;
        size--;
        return ele;
    }
    int size(){
        return size;
    }
    int peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return q[f];
    }
    void display(){
        if(size == 0) return;
        if(r > f){
            for(int i = f;i < r;i++) System.out.print(q[i] + " ");
        }
        else{
            for(int i = f;i < q.length;i++) System.out.print(q[i] + " ");
            for(int i = 0;i < r;i++) System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
public class QueueAsAnArray {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(4);
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}
