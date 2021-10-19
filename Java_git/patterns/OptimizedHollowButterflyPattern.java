package patterns;
import java.util.Scanner;
public class OptimizedHollowButterflyPattern{
	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=sc.nextInt();
		sc.close();
		n=2*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==j||j==(n+1)-i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}