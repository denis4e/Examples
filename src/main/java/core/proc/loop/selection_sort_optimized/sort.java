package core.proc.loop.selection_sort_optimized;

import java.util.Arrays;
public class sort {
	public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length; barrier++) {
        	for (int index = 0; index <arr.length-1; index++) {
            	   if(arr[index]>arr[index+1])
            	   {
                   int tmpmax=arr[index];
                   int tmpmin=arr[index+1];
                   arr[index+1] = tmpmax;
                   arr[index] = tmpmin;          
                   System.out.println(Arrays.toString(arr)+" �����������");	
           }
                    
        }}}}
