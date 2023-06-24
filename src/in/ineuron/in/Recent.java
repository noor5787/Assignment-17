package in.ineuron.in;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.offer(t); // Add the new request at time t

        while (!requests.isEmpty() && t - requests.peek() > 3000) {
            requests.poll(); // Remove requests older than 3000 milliseconds
        }

        return requests.size();
    }
}

public class Recent {
 
	
	    public static void main(String[] args) {
	        RecentCounter recentCounter = new RecentCounter();
	        System.out.println(recentCounter.ping(1));    // Output: 1
	        System.out.println(recentCounter.ping(100));  // Output: 2
	        System.out.println(recentCounter.ping(3001)); // Output: 3
	        System.out.println(recentCounter.ping(3002)); // Output: 3
	    }
	}

