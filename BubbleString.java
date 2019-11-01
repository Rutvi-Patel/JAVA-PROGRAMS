package recursive;
import java.util.*;
import java.util.Scanner;
public class BubbleString {
	 public static void main(String[] args) {
		 Scanner scnr = new Scanner (System.in);
		 System.out.println("Enter length of an array");
		 int element = scnr.nextInt();
		 String[] arr= new String[element];
		 System.out.println("Enter a words");
		 for (int i=0;i<element;i++) {
			 arr[i]= scnr.next();
		 }
	      /* Type your code here. */
		 
		 bubbleSort(arr);

			}
			public static void bubbleSort(String[] arr) {
				for (int i = 0; i < arr.length;i++) {
					for (int j = 0;j<arr.length-1-i;j++) {
						if (arr[j].toLowerCase().compareTo(arr[j+1].toLowerCase())>0) {
							String temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;
							}
					}
				}
				System.out.println(Arrays.toString(arr));
			}//method
}//class
