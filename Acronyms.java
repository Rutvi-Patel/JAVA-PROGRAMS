package classANDoop;
import java.util.Scanner;
public class Acronyms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
	      String userPhrase = scnr.nextLine();
	      System.out.println(createAcronym(userPhrase));
	      
	   }
	   public static String createAcronym(String userPhrase){
		   String acronym ="";
		   char letter;
		   String[] lst = userPhrase.split(" ");
	      for (String word : lst) {
	    	  if (!word.equals(word.toLowerCase())){
	    		  letter = word.charAt(0);
	    		  acronym = acronym + letter;
	    	  }else {
	    		  continue;
	    	  }
	      	}
	      return acronym;
	  }
}
