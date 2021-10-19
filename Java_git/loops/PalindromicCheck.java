package loops;
import java.util.Scanner;
public class PalindromicCheck {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number:-");
		int n=sc.nextInt();
		int temp=n;
		int check=0;
		while(temp>0) {
			int lastdigit=(temp%10);
			temp=temp/10;
			check= check*10 +lastdigit;
		}
		if(n==check) {
			System.out.println(n + " is Palindromic");
		}else {
			System.out.println(n + " is not Plindromic");
		}
		sc.close();
	}

}
