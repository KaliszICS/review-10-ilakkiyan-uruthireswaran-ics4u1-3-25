public class PracticeProblem {

	public static String pyramid(int x) {
		String k = "";
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < x - i; j++) {
				k += " ";
			}
			for (int j = -1; j < (1 * i - 1); j++) {
				k += "* ";
			}
			k += "\n";
	}
	return k;
}

	

	public static void main(String args[]) {

	}

}
