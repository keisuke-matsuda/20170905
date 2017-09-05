
public class FizzBuzz {

	public static String[] fizzBuzz() {
		String[] test = new String[100];
		test = fizzBuzz(1,100);
		return test;
	}

	public static String[] fizzBuzz(int n) {
		String[] test = new String[n];
		test = fizzBuzz(1,n);
		return test;
	}

	public static String[] fizzBuzz(int begin, int end) {
		return 	fizzBuzz(begin, end, "Fizz", "Buzz");
	}

	public static String[] fizzBuzz(String fizz, String buzz) {
		return 	fizzBuzz(1, 100, fizz, buzz);
	}

	public static String[] fizzBuzz(int begin, int end, String fizz, String buzz) {
		String[] test = new String[end - begin + 1];
		for (int j = begin; j <= end; j++) {
			test[j - begin] = fizzBuzzConvert(j, fizz, buzz);
		}
		return test;
	}

	public static String fizzBuzzConvert(int i) {
		return fizzBuzzConvert(i, "Fizz", "Buzz");
	}

	public static String fizzBuzzConvert(int i, String fizz, String buzz) {
		if (i % 3 == 0 && i % 5 == 0) {
			return fizz + buzz;
		} else if (i % 3 == 0) {
			return fizz;
		} else if (i % 5 == 0) {
			return buzz;
		} else {
			return Integer.toString(i);
		}

	}

}
