import java.util.Scanner;
import java.text.DecimalFormat;

public class Restaurantcheck {
	public static void main(String[] args) {
		System.out.println("Enter the charge for food");
		DecimalFormat f = new DecimalFormat("##.00");
		Scanner sc = new Scanner(System.in);
		double charge = sc.nextDouble();
		double tax = charge * .07;
//		double tax1 = (round(tax, 2))
		double tip = charge * .18;

//				tip1 = float(round(tip, 2))
		double total = tax + tip + charge;
//				total1 = float(round(total, 2))
		System.out.println("Tax: $ " + f.format(tax) + " , " + " Tip: $ " + f.format(tip) + " , " + " Total: $ "
				+ f.format(total));
	}

}
