import java.util.Scanner;
public class Triplets {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: "); 
        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<len;i++) {
        	a[i]=sc.nextInt();  
        	}
        int counter = 0;
        for(int i=0;i<len;i++) 
        {
            for (int j=i+1; j<len; j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    if(a[i] + a[j] + a[k] == 0)
                    {
                        System.out.println("("+a[i]+" , "+a[j]+" , "+a[k]+")");
                        ++counter;
                    }
                }
            }

        }
        System.out.println("There are " + counter +" distinct triplets");
    }
}
