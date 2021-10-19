package arrays;
import java.util.Scanner;
public class MatrixSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Initialization
		System.out.println("Enter Rows and Cols of 1st Matrix:-");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int arr[][]= new int[m1][n1];
		System.out.println("Enter Rows and Cols of 2st Matrix:-");
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		int brr[][]= new int[m2][n2];
		// 2D ARRAY FILLING PROCESS
		System.out.println("Fill 1st matrix:-");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Fill 2st matrix:-");
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
				brr[i][j]=sc.nextInt();
			}
		}
		//SUM OF TWO MATRIX
		int m=Math.max(m2, m1);
		int n=Math.max(n2, n1);
		int a=Math.min(m2, m1);
		int b=Math.min(n2, n1);
		int sum[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i<a && j<b) {
					sum[i][j]=arr[i][j] + brr[i][j];
				}else if(m==m1 && n==n1){
					sum[i][j]=arr[i][j];
				}else {
					sum[i][j]=brr[i][j];
				}
				
			}
		}
		//PRINTING OUTPUT
		System.out.println("Sum this two arrays:-");
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("     +    ");
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(brr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("    =     ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sum[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
