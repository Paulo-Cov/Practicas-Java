import java.util.Scanner;

public class Part1WhileLoops {
   public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        //TODO implement While loop to get print result
	        int i = 0;
	        while (i <= 10) {
	        	System.out.println(num + " x " + i + " = " + num*i);
	        	i++;
	        }
	    }
	}