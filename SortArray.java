package recursive;
import java.util.*;
import java.util.Scanner;
public class SortArray {
	public static void main(String[] args) {
	      /* Type your code here. */
		Scanner scnr = new Scanner(System.in);
		int element = scnr.nextInt();
		int[] Myarr = new int[element];
		for (int i = 0; i<element;i++) {
			Myarr[i] = scnr.nextInt();
			}
		sortArray(Myarr,element);
		for (int each: Myarr){
		   System.out.print(each+" ");
		}
		System.out.println();
	}
	public static void sortArray(int[] myArr, int arrSize) {
		int temp = 0;
		int smallest;
		for(int i=0;i<arrSize-1;i++) {
		   smallest = i;
			for (int j=i+1;j<arrSize;j++) {
				if (myArr[smallest]>myArr[j]) {
				   smallest = j;
	}//if
					
			}//for
			temp = myArr[i];
					myArr[i] = myArr[smallest];
					myArr[smallest]=temp;
	}//for
	}//method
}//class