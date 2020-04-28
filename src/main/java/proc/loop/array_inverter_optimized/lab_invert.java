package proc.loop.array_inverter_optimized;
import java.util.Arrays;
public class lab_invert {	
		public static void invert1(int[] arr){ //меняет первыми крайние элементы
		int left=0;
		int length = arr.length/2;
		for (int i=length-1; i>=left; i--) {
		int tmp=arr[i];
		arr[i]=arr[length-i-1];
		arr[left]=tmp;
		left++;
		System.out.println(Arrays.toString(arr));
		 }}}
/*	
		public static void invert2(int[] arr){ //меняет первыми крайние элементы всего масива
			int length = arr.length;
			for (int i=length/2; i>=0; i--) {
			int tmp=arr[i];
			arr[i]=arr[length-i-1];
			arr[length-i-1]=tmp;
			System.out.println(Arrays.toString(arr));
			 }}
		public class lab_invert {	
			public static void invert0(int[] arr){ ////меняет первыми средние элементы
			int length = arr.length/2;
			for (int i=(length/2)-1; i>=0; i--) {
			int tmp=arr[i];
			arr[i]=arr[length-i-1];
			arr[length-i-1]=tmp;
			System.out.println(Arrays.toString(arr));
		}}	}*/



