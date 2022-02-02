import java.util.Scanner;

public class CondIf {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Tell me your age");
		double age = a.nextDouble();
			if (age >= 18 && age < 150) {
			// Ejecutar declaración de bloque;
				System.out.println("You are over 18");

			}
			else if( age > 0 && age <= 18){
			// Ejecutar segunda declaración de bloque de condición;
				System.out.println("You are over under 18");
			} else{
			// Ejecutar otra declaración de bloque;
				System.out.println("Age out of value range");
			}

	
	}
}