package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Suma: " + suma(1, 2));
		System.out.println("Resta: " + resta(3, 2));
		Persona persona = new Persona();
		persona.setApellido("any");
	}

	public static float suma(int a, int b) {
		return a + b;
	}
	
	public static float resta(int a, int b) {
		return a - b;
	}
	
	public static float restaInconveniente(int a, int b) {
		return a - b + 2;
	}
}