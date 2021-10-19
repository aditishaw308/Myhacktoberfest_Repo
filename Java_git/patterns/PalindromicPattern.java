package patterns;
import java.util.Scanner;
public class PalindromicPattern {
	public static void main(String[] args) {
		System.out.println("Enter a number:-");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("   ");
			}
			int k=i+1;
			for(int j=1;j<=(2*i-1);j++) {
				if(j<=((2*i-1)+1)/2) {
					System.out.print(" " + --k + " ");
				}else {
					System.out.print(" " + ++k + " ");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("   ");
			}
			int k=i+1;
			for(int j=1;j<=(2*i-1);j++) {
				if(j<=((2*i-1)+1)/2) {
					System.out.print(" " + --k + " ");
				}else {
					System.out.print(" " + ++k + " ");
				}
			}
			System.out.println();
		}
		
	}

}
