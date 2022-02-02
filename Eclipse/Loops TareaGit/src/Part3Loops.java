import java.util.Scanner;

public class Part3Loops {
	public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Tell me your name");
        String name = cons.nextLine();
        int lenght = name.length();
        for (int i = 0; i < lenght; i++) {
        	System.out.println(i+ " : " + name.charAt(i));
        }
	}
}
