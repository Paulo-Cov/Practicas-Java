import java.util.Scanner;

public class prograLibre {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Dime tu usuario");
		String user = s.nextLine();
		System.out.println("Dime tu constraseña");
		String password = s.nextLine();
		//SavedUser
		String _user = "Pau";
		String _password = "1234";
		
		System.out.println(user == _user);
		System.out.println(user.equals(_user));
		System.out.println(password == _password);
		System.out.println(password.equals(_password));
		
		int var1	= password.compareTo(_password);
		if (var1 == 0 && user.equals(_user)) {
			System.out.println("Bienvenido");
		}
		else if(var1 == 0){
			System.out.println("Revisa tu usuario");
		}
		else if(user.equals(_user) && var1 != 0) {
			System.out.println("Revisa tu contraseña");

		}
		else {
			System.out.println("Revisa usuario y contraseña");
		}
	}
}
