package arrays;
import java.util.Scanner;
public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows and Cols of Matrix:-");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]= new int[m][n];
		System.out.println("Fill 1st matrix:-");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Transpose of this Matrix:-");
		int[][] trans= new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				trans[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(trans[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
