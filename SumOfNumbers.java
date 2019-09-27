package branching;

public class SumOfNumbers {
	public static void main(String[] args) {
		int add = 0;
		int count = -2;
		while (count < 1000) {
			count += 3;
			add += count;
		}
		System.out.println(add);
	}// main
}// class
