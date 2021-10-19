package arrays;
import java.util.Scanner;
public class MaxInArray{
	public static void main(String[] anjan) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array length:-");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Fill your Array:-");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0,min=99999;
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
			min=Math.min(min,arr[i]);
		}
		System.out.println("Maximum in your array is "+ max + " Minimum is "+ min);
		sc.close();
	}
}