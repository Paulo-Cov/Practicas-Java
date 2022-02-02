import java.util.Scanner;

public class weigthChallenge {
	public static void main(String[] args) {
		Scanner w= new Scanner(System.in);
		System.out.println("Tell me yout weight in Kilos");
		double weight = w.nextDouble();
		System.out.println("Tell me yout height in m");
		double height = w.nextDouble();
		double BMI = (weight/(height*height));
		if (BMI < 20 ) {
			System.out.println("Your BMI is " + BMI + ", you are underwight ");
		}
		else if(BMI < 25 && BMI >=20 ) {
			System.out.println("Your BMI is " + BMI + ", you are doing great ");
		}
		else if(BMI < 30 && BMI >=25 ) {
			System.out.println("Your BMI is " + BMI + ", you are overweight ");
		}
		else if(BMI >= 30) {
			System.out.println("Your BMI is " + BMI + ", you are obese");
		}
	}
}
