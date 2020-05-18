package core.proc.loop.array_merger_fixed;
import java.util.Arrays;
public class lab2_main {

	public static void main(String[] args) {
		int []arr0=new int[] {0,3,5,7,9,11,13,15,17,19,21};
		int []arr1=new int[] {0,2,4,6,8,10,12,14,16,18,20};
        merge(arr0, arr1);   		
	}
	/*public static int[] marge(int[] arr0, int[] arr1) {
		  int res = arr0.length + arr1.length;
		  int tmparr0l=arr0.length;
		  int tmparr1l=arr1.length;
		  int[] result = new int[res];
		  int j = 0;
		  int e = 0;
		  int[]tmpArr = null;
		  int[]tmpArr1;
		  if(arr0.length>=arr1.length)
		  {  tmpArr=Arrays.copyOf(arr0, tmparr0l);
		     tmpArr1=Arrays.copyOf(arr1, tmparr1l);
		  }
		  else{  tmpArr=Arrays.copyOf(arr1, tmparr1l);
		         tmpArr1=Arrays.copyOf(arr0, tmparr0l);
		  }
		  for (int i = 0; i <= res - 1; i++) {
		   if (j < tmpArr1.length) {
		    if (tmpArr[e] < tmpArr1[j]) {
		     result[i] = tmpArr[e];
		     e++;
		    } else {
		     result[i] = tmpArr1[j];
		     j++;
		    }
		   } else {
		    result[i] = tmpArr[e];
		    e++;
		   }
		   System.out.println(Arrays.toString(result));
		  }
		  return result;
		 }
		 */
	
	  public static int[] merge(int[] arr0, int[] arr1) { 
		  int col = arr0.length + arr1.length;
	      int[] result = new int[col];
	      int aIndex = 0;
	      int bIndex = 0;	
	      for (int i = 0; i <= col; i++) {
	    	   if (bIndex < arr0.length) {
	    	    if (arr0[aIndex] < arr1[bIndex]) {
	    	     result[i] = arr0[aIndex];
	    	     aIndex++;
	    	    } else {
	    	     result[i] = arr1[bIndex];
	    	     bIndex++;
	    	    }
	    	   } else {
	    		   System.arraycopy(arr0, aIndex, result,i,col-i);
	    	   }}
	    	  System.out.println(Arrays.toString(result));
	    	  return result;
	      }
	    }	 
		 
		





