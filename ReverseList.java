package ArraysAndList;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseList {
	public static void main(String [] args) {
		 Scanner scnr = new Scanner(System.in);
	      int[] userList = new int[20];   // List of numElement integers specified by the user
	      int numElements;   // Number of integers in user's list
	      String reverse = "";
	      numElements= scnr.nextInt();
	      for (int i=0;i<numElements;++i){
	    	 userList [i]= scnr.nextInt();
	      }
	      for (int i = numElements-1;i>=0;--i){
	    	  reverse = reverse + userList[i]+" ";
	      }
	      System.out.println(reverse);
}
}
