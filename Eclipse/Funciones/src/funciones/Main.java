package funciones;

public class Main {
	public static void main(String[] args) {
		lista("Paulo", 25, 1996);
		lista("Steph", 23, 1998);
		lista("Alex", 27, 1994);
	}
	
	static void lista(String nombre, int edad, int año) {
		System.out.println(nombre + " tiene " + edad + " años, nacio en " + año);
	}
}
