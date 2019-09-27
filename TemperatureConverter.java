import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius:");
		int temp = sc.nextInt();
		double far = 9.0 / 5.0 * temp + 32;
		System.out.println(far + " Fahrenheit");
	}
}
