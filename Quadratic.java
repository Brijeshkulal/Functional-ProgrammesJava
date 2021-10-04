import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
        System.out.println("To calculate the Quadratic Roots of Equation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        int delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);
        if(delta > 0)
        {
        	double Root1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
        	double Root2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
        	System.out.println("Root 1: " + Root1 + "  &  Root 2: " + Root2);
        }
        else
        {
        	System.out.print("Roots are imaginary");
        	}
    }

}

