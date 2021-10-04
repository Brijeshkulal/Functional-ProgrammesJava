import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("Creating a 2 Dimensional Array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int z = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = z;
                System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "  ");
                z++;
            }
            System.out.println();
        }
    }
}

