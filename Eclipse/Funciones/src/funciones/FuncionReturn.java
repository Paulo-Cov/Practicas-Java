package funciones;
import java.util.Scanner;

public class FuncionReturn {
	private static Scanner in;
	private static Scanner op;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		op = new Scanner(System.in);

        System.out.println("Que operación quieres?(1=sum, 2=res, 3=mul, 4=div)");
        int op = in.nextInt();
        System.out.println("Dime el primer número de la operación");
        Double a = in.nextDouble();
        System.out.println("Dime el segundo número de la operación");
        Double b = in.nextDouble();
        switch (op) {
		case 1: {
			System.out.println("La suma es: "+ sum(a, b));
			break;
					}
		case 2: {
			System.out.println("La resta es: "+ res(a, b));		
			break;
}
		case 3: {
			System.out.println("La multiplicación es: "+ mul(a, b));
			break;

					}
		case 4: {
			System.out.println("La división es: "+ div(a, b));
			break;

					}
		default:
			System.out.println("Operación no reconocida: " + op);
			break;

		}
        
		

	}
		
	static String sum(Double a, Double b) { 
		return "";
	}
	static double res(Double a, Double b) { 
		return a - b;
	}
	static double mul(Double a, Double b) { 
		return a * b;
	}
	static double div(Double a, Double b) { 
		return a / b;
	}
}