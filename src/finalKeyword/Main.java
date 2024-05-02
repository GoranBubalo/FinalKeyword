package finalKeyword;

//final keyword
public class Main {

	public static void main(String[] args) {

		// final keyword - > indicate that the method cannot
		// overridden by subclasses

		double pi = 3.14159;
		pi = 4;
		System.out.println(pi);
		System.out.println();
		//This value can not be changed
		final int Age = 21;
		// int Age = 30;
		System.out.println(Age);
	}

}
