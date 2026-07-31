/* Operations on Queue
Solved
Difficulty: BasicAccuracy: 58.39%Submissions: 40K+Points: 1Average Time: 20m
Implement a class myQueue that supports following operations:

void enqueue(int x): Insert an element x at the end of the queue.
void dequeue(): Remove the element from the front of the queue.
int getFront(): Return the element at the front of the queue.
int getRear(): Return the element at the rear end of the queue.
bool isEmpty(): Return true if the queue is empty, otherwise false.
int size(): Return the number of elements currently in the queue.
There will be a sequence of q queries queries[][]. The queries are represented in numeric form:

1 x - Call enqueue(x)
2 - Call dequeue()
3 - Call getFront()
4 - Call getRear()
5 - Call isEmpty()
6 - Call size()
The driver code will process the queries, call the corresponding functions, and print the outputs of getFront(), getRear(), isEmpty(), size() operations. You only need to implement the above six functions.

Examples:

Input: q = 8, queries[][] = [[1 1], [1 7], [1 8], [2], [3], [4], [5], [6]]
Output: [7, 8, false, 2]
Explanation: Operations on queue will process as follows:
  • enqueue(1) in the queue.
  • enqueue(7) in the queue.
  • enqueue(8) in the queue.
  • dequeue(), 1 will be removed from the queue.
  • getFront(), return 7.
  • getRear(), return 8.
  • isEmpty(), queue is non-empty; i.e. return false.
  • size(), queue currently contains two elements, return 2.
Input: q = 4, queries[][] = [[5], [1 3], [1 6], [4]]
Output: [true, 6]
Explanation: Operations on queue will process as follows:
  • isEmpty(), queue is empty; i.e. return true.
  • enqueue(3) in the queue.
  • enqueue(6) in the queue.
  • getRear(), return 6.
Constraints: 
1 ≤ q ≤ 103
1 ≤ x ≤ 103*/
import java.util.LinkedList;
import java.util.Queue;
class myQueue {
    Queue<Integer> q;
    public myQueue() {
        // initialize your queue
        q = new LinkedList<>();
    }

    public void enqueue(int x) {
        // insert x into queue
        q.add(x);
    }

    public void dequeue() {
        // remove front element from queue
        q.remove();
    }

    public int getFront() {
        // return the front element of the queue
        return q.peek();
    }

    public int getRear() {
        // return the rear element of the queue
        for(int i = 1;i < q.size();i++){
            q.add(q.remove());
        }
        int ele = q.peek();
        q.add(q.remove());
        return ele;
    }

    public boolean isEmpty() {
        // check whether the queue is empty
        return q.isEmpty();
    }

    public int size() {
        // return the size of the queue
        return q.size();
    }
}

public class Pro_02 {
    public static void main(String[] args) {
        myQueue q = new myQueue();
        System.out.println(q);
    }
}
