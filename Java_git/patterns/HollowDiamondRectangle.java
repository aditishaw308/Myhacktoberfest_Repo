package patterns;
import java.util.Scanner;
public class HollowDiamondRectangle{
	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			int k=i-1;
			if(!(i==1)) {
				
				for(int j=1;j<=(2*k-1);j++) {
					System.out.print("  ");
				}
			}
			for(int j=n;j>=i;j--) {
				if(i==1 && j==1) {
					System.out.print("");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			int k=i-1;
			if(!(i==1)) {
				
				for(int j=1;j<=(2*k-1);j++) {
					System.out.print("  ");
				}
			}
			for(int j=n;j>=i;j--) {
				if(i==1 && j==1) {
					System.out.print("");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
