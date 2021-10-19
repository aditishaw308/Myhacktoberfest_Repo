package patterns;
import java.util.Scanner;
public class HollowDiamondPattern {
	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("  ");
			}
			int end=(2*i-1);
			for(int j=1;j<=end;j++) {
				if(j==1||j==end) {
					System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("  ");
			}
			int end=(2*i-1);
			for(int j=1;j<=end;j++) {
				if(j==1||j==end) {
					System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
