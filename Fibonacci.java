package recursive;

public class Fibonacci {
	public static int computeFibonacci(int N) {
	      if (N==0) {
	         return 0;
	      }if(N==1){
	         return 1;
	         }else{
	        	 System.out.println();
	         return computeFibonacci(N-1) + computeFibonacci(N-2);
	   }
	}

	   public static void main(String[] args){
	      int N;      // F_N, starts at 0

	      N = 8;
	   
	      System.out.println("F_" + N + " is " + computeFibonacci(N));
	   }

}
