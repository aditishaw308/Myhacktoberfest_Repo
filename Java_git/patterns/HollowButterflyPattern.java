package patterns;
import java.util.Scanner;
public class HollowButterflyPattern{
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			int space= (2*n-2*i);
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			int space= (2*n-2*i);
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}