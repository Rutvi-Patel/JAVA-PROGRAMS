package recursive;
public class Bunny {
	public static void main (String[] args) {
		Bunny b1= new Bunny();
		System.out.println(b1.bunnyEars(5));
		System.out.println(b1.bunnyFunnyEars(4));
		}
	 public int bunnyEars (int n) {
		 if (n ==0) {
			 return 0;
		 }else {
			 return 2 + bunnyEars(n-1);
		 }
	}
	 public int bunnyFunnyEars(int n) {
		 if (n==0) {
			 return 0;
		 }else {
		  if (n%2==0) {
			 return 2 + bunnyFunnyEars(n-1);
		 }else{
			 return 3 + bunnyFunnyEars(n-1);
		 }//else
	}//else 
}//method
}//class
