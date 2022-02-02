import java.util.Scanner;

public class ClassGrader {
	public static void main(String[] args) {
		Scanner g= new Scanner(System.in);
		System.out.println("Tell me your grade");
		double grad= g.nextDouble();
		if (grad >= 0 && grad <=3 ) {
			System.out.println("Failed");
		}
		else if (grad > 3 && grad <= 5 ) {
			System.out.println("Insufficient ");
		}
		else if (grad > 5 && grad < 10 ) {
			System.out.println("Good");
		}
		else if (grad == 10) {
			System.out.println("Excellent Grade ");
		} 
		else {
			System.out.println("Error, grade out of range");
		}
	}
}
