package in.ineuron.in;
import java.util.ArrayList;
import java.util.List;

class FrontMiddleBackQueue {
    private List<Integer> queue;

    public FrontMiddleBackQueue() {
        queue = new ArrayList<>();
    }

    public void pushFront(int val) {
        queue.add(0, val);
    }

    public void pushMiddle(int val) {
        int mid = queue.size() / 2;
        queue.add(mid, val);
    }

    public void pushBack(int val) {
        queue.add(val);
    }

    public int popFront() {
        if (queue.isEmpty())
            return -1;

        return queue.remove(0);
    }

    public int popMiddle() {
        if (queue.isEmpty())
            return -1;

        int mid = (queue.size() - 1) / 2;
        return queue.remove(mid);
    }

    public int popBack() {
        if (queue.isEmpty())
            return -1;

        return queue.remove(queue.size() - 1);
    }
}

public class Main1 {

	    public static void main(String[] args) {
	        FrontMiddleBackQueue q = new FrontMiddleBackQueue();
	        q.pushFront(1);
	        q.pushBack(2);
	        q.pushMiddle(3);
	        q.pushMiddle(4);
	        System.out.println(q.popFront());   // Output: 1
	        System.out.println(q.popMiddle());  // Output: 3
	        System.out.println(q.popMiddle());  // Output: 4
	        System.out.println(q.popBack());    // Output: 2
	        System.out.println(q.popFront());   // Output: -1
	    }
	}

