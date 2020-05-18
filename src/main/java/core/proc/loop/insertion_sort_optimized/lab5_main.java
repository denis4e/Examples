package core.proc.loop.insertion_sort_optimized;

import java.util.Arrays;

public class lab5_main {

	public static void main(String[] args) {
        
		int mass=100;
		int [] arr=new int[mass];
		for (int i=0;i<arr.length;i++){
	        arr[i] = (7*mass++); }
		System.out.println("Start " +Arrays.toString(arr));
		Sort.sort(arr);
		System.out.println("Finish " +Arrays.toString(arr));
		
	}

}
