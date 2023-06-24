package in.ineuron.in;

 class SchoolCafeteria {
    public int countStudents(int[] students, int[] sandwiches) {
        int count = 0; // Counter for students unable to eat
        
        // Loop until there are no more students or sandwiches
        while (students.length > 0 && sandwiches.length > 0) {
            if (students[0] == sandwiches[0]) {
                // The student at the front of the queue prefers the top sandwich
                // They will take it and leave the queue
                removeFirstElement(students);
                removeFirstElement(sandwiches);
            } else {
                // The student at the front of the queue does not prefer the top sandwich
                // They will leave it and go to the queue's end
                rotateQueue(students);
            }
        }
        
        // Count the remaining students unable to eat
        count = students.length;
        return count;
    }
    
    // Helper method to remove the first element from an array
    private void removeFirstElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        arr[arr.length - 1] = 0; // Set the last element to 0 or any other default value
    }
    
    // Helper method to rotate the queue (move the first element to the end)
    private void rotateQueue(int[] arr) {
        int firstElement = arr[0];
        
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        arr[arr.length - 1] = firstElement;
    }
}

public class Main {

	    public static void main(String[] args) {
	        int[] students = {1, 1, 1, 0, 0, 1};
	        int[] sandwiches = {1, 0, 0, 0, 1, 1};
	        
	        SchoolCafeteria cafeteria = new SchoolCafeteria();
	        int unableToEat = cafeteria.countStudents(students, sandwiches);
	        
	        System.out.println("Number of students unable to eat: " + unableToEat);
	    }
	}

