package core.proc.loop.bubble_sort_inverted;
import java.util.Arrays;
public class lab3_main {	
	public static void main(String[] args) {
		int []arr=new int[] {0,4,7,5,3,4,2,3,1,2,0,1,9,13,11,0};
		System.out.println(" Start "+Arrays.toString(arr));
		 for (int barrier = 0; barrier <arr.length - 1; barrier++) {
	            for (int index =arr.length - 1 ; index>barrier ; index--) {
	                if (arr[index] < arr[index - 1]) {
	                    int tmp = arr[index];
	                    arr[index] = arr[index - 1];
	                    arr[index - 1] = tmp;
	                    System.out.println(Arrays.toString(arr));
	                }}}}}
