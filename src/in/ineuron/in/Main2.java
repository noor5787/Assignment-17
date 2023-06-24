package in.ineuron.in;
import java.util.LinkedList;
import java.util.Queue;

class DataStream {
    private int value;
    private int k;
    private Queue<Integer> stream;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.stream = new LinkedList<>();
    }

    public boolean consec(int num) {
        stream.add(num);
        if (stream.size() < k) {
            return false;
        } else {
            stream.poll();
            for (int element : stream) {
                if (element != value) {
                    return false;
                }
            }
            return true;
        }
    }
}

public class Main2 {

	    public static void main(String[] args) {
	        DataStream dataStream = new DataStream(4, 3);
	        System.out.println(dataStream.consec(4)); // Output: false
	        System.out.println(dataStream.consec(4)); // Output: false
	        System.out.println(dataStream.consec(4)); // Output: true
	        System.out.println(dataStream.consec(3)); // Output: false
	    }
	}

