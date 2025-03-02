import java.text.DecimalFormat;

public class Example04_02 {
	public static void main(String[] args) {
		System.out.println();
		System.out.println(" Angle\t\tSin\t\t\tCos\t\t\ttan");
		for (int n = 1; n <= 75; n++)
			System.out.print("=");
		System.out.println();
		DecimalFormat sixDigit = new DecimalFormat("0.000000");
		double radians;
		for (double angle = 0.0; angle <= 360; angle += 20.0) {
			radians = Math.toRadians(angle);
			System.out.print(sixDigit.format(angle) + "\t\t");
			System.out.print(sixDigit.format(Math.sin(radians)) + "\t\t");
			System.out.print(sixDigit.format(Math.cos(radians)) + "\t\t");
			System.out.println(sixDigit.format(Math.tan(radians)));
		}
	}
}