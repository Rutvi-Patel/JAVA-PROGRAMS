package classANDoop;
import java.util.*;

public class AreaCalculatorTest {
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		try {
		System.out.println("Enter the length :");
		int length = scnr.nextInt();
		System.out.println("Enter the height :");
		int height = scnr.nextInt();
		AreaCalculator obj = new AreaCalculator();
		System.out.println("The area is: "+obj.calculateRectangle(length, height));
		}//
		catch (Exception IllegalArgumentException) {
			System.out.println(IllegalArgumentException);
		}//catch
	}//main
}//class
