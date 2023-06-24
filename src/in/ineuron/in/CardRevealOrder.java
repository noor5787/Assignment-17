package in.ineuron.in;
import java.util.*;
public class CardRevealOrder {



	    public int[] deckRevealedIncreasing(int[] deck) {
	        Arrays.sort(deck);
	        Queue<Integer> indexQueue = new LinkedList<>();
	        int n = deck.length;
	        int[] result = new int[n];

	        for (int i = 0; i < n; i++) {
	            indexQueue.add(i);
	        }

	        for (int card : deck) {
	            result[indexQueue.poll()] = card;
	            if (!indexQueue.isEmpty()) {
	                indexQueue.add(indexQueue.poll());
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] deck = {1, 1000};
	        CardRevealOrder solution = new CardRevealOrder();
	        int[] result = solution.deckRevealedIncreasing(deck);
	        System.out.println(Arrays.toString(result));
	    }
	}

