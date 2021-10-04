import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x =sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y =sc.nextInt();
        double distance = (double) Math.sqrt((x * x) + (y * y));
        System.out.println("Euclidean distance from the point (x, y) to the origin ( 0 , 0) is : " + distance);
    }
}


