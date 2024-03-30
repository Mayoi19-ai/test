package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Suma: " + suma(1, 2));
		System.out.println("Resta: " + resta(3, 2));
	}

	public static float suma(int a, int b) {
		return a + b;
	}
	
	public static float resta(int a, int b) {
		return a - b;
	}
}