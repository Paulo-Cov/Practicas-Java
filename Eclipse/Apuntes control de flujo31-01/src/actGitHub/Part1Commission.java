package actGitHub;
import java.util.Scanner;

public class Part1Commission {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dime el total de la venta");
		int venta = s.nextInt();
		if (venta >= 10000) {
			System.out.println("Tu comisión es de: " + venta*.30 );
		}
		else if (venta >= 5001 && venta <1000){
			System.out.println("Tu comisión es de: " + venta*.20 );
		}
		else if (venta >= 1001 && venta < 5001){
			System.out.println("Tu comisión es de: " + venta*.10 );
		}
		else {
			System.out.println("No tienes comisión");
		}
	}
}
