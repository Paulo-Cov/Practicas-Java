import java.util.Scanner;

public class OpTernario {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in); 
		System.out.println("Tell me your age ");
		int age = a.nextInt();
		System.out.println(age >= 18 && age <= 150 ? "You are over 18":  (age > 150 ? "Age over range" : (age < 18 && age >= 0 ? "You are under 18" : "Age under range")) );

	}
}
