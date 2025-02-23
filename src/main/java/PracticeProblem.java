public class PracticeProblem {

	public static String pyramid(int x) {
		if (x <= 0) {
			return "";
		}

		String star = "";
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < x - i; j++){
				star += " ";
			}

			for (int j = 0; j < i; j++) {
				star += "*";
				if (j < i - 1) {
					star += " ";
				}
			}
			if (i < x) {
				star += "\n";
			}
		}
		return star;
	}

	public static String square(int y) {
		if (y <= 0) {
			return "";
		}

		if (y == 1) {
			return "*";
		}

		String box = "";
		// first row
		for (int i = 0; i < y; i++) {
			box += "*";
		}
		// middle row
		for (int i = 0; i < y - 2; i++) {
			box += "\n*";
			for (int j = 0; j < y - 2; j++) {
				box += " ";
			}
		box += "*";
		}
		// last row
		if (y > 1) {
			box += "\n";
			for (int i = 0; i < y; i++) {
				box += "*";
			}
		}
		return box;
	} 

	public static boolean hasLowercase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				return true;
			} 
		}
		return false;
} 
	



	public static void main(String args[]) {
		String result = pyramid(7);
		System.out.println(result);

		String result1 = square(3);
		System.out.println(result1);

		boolean result2 = hasLowercase("whatever");
		System.out.println(result2);

	}

}
