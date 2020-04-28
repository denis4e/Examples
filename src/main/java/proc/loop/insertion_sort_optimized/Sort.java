package proc.loop.insertion_sort_optimized;

import java.util.Arrays;

public class Sort {
	public static void sort(int[] arr) {
	        for (int i = 1;i < arr.length; i++) {
	            int newElement = arr[i];
	            int location = i - 1;
	            while (location >= 0 && arr[location] > newElement) {
	            	arr[location + 1] = arr[location];
	                location--;
	            }
	            arr[location + 1] = newElement;
	            System.out.println("In proces " +Arrays.toString(arr));
	        }
	    }
}
