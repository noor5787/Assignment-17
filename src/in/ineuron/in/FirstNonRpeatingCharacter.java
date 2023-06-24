package in.ineuron.in;

public class FirstNonRpeatingCharacter {

	
	    public static int firstUniqChar(String s) {
	        int[] charCount = new int[26]; // Assuming input string only contains lowercase English letters
	        
	        // Count the frequency of each character in the input string
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            charCount[c - 'a']++;
	        }
	        
	        // Find the index of the first non-repeating character
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (charCount[c - 'a'] == 1) {
	                return i;
	            }
	        }
	        
	        return -1; // No non-repeating character found
	    }
	    
	    public static void main(String[] args) {
	        String s = "loveleetcode";
	        int index = firstUniqChar(s);
	        System.out.println("Index of the first non-repeating character: " + index);
	    }
	}

