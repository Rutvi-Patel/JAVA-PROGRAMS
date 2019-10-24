package recursive;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String word = scnr.next();
		if (ispal(word)){
			   System.out.println("Palindrome");
			}else{
			   System.out.println("Different word");
		   }
	}
	public static boolean ispal(String word) {
		if (word.length()==1 || word.length()==0) {
			return true;
		}else if (Character.toUpperCase(word.charAt(0))== Character.toUpperCase(word.charAt(word.length()-1))) {
				return ispal(word.substring(1,word.length()-1));
		}else {
			return false;
		}
	}//method
}//class
