import java.util.Scanner;

public class CondIf {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Tell me your age");
		double age = a.nextDouble();
			if (age >= 18 && age < 150) {
			// Ejecutar declaraci�n de bloque;
				System.out.println("You are over 18");

			}
			else if( age > 0 && age <= 18){
			// Ejecutar segunda declaraci�n de bloque de condici�n;
				System.out.println("You are over under 18");
			} else{
			// Ejecutar otra declaraci�n de bloque;
				System.out.println("Age out of value range");
			}

	
	}
}