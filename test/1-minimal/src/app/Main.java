package app;

public class Main {
	
	public int multiply(int x, int y) {
		return x * y;
	}

	/**
	 * @param args Ignored
	 */
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.multiply(3, 2));
	}

}
