import java.util.Scanner;

public class FibonacciPart2DoWhileLoops {
public static void main(String[] args) {
	        int i = 1;
	       
	        Scanner num = new Scanner(System.in);
	        System.out.println("Dime la cantidad de números en la secuencia que quieres ver");
	        int n = num.nextInt();
	        System.out.println("0 : 0" );
	        int v = 1;
	        int v1 = 0;
	        int v2 = 0;		
	        do
	        {
	            
	            System.out.println(i + " : " + v);
	            v2 = v1;
	            v1 = v;
	            v = v1+v2;
	            		
	            i++;
	        }
	        while (i <= n);
	    }
}

