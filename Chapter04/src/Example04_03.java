public class Example04_03 {
	public static void main(String[] args) {
		int value;
		String output = "Random number 0 to 9 : \n";
		for (int c = 1; c <= 10; c++) {
			value = (int) (Math.random() * 10);
			output += value + ", ";
		}
		System.out.println(output);
		output = "\nRandom number 15 to 25 : \n";
		for (int c = 1; c <= 10; c++) {
			value = 15 + (int) (Math.random() * 11);
			output += value + ", "; // append value to output
		}
		System.out.println(output);
	}
}
