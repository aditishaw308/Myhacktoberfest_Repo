package patterns;
import java.util.Scanner;
public class DiamondPattern {
	public static void main (String[] args) {
		var sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("   ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("   ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
