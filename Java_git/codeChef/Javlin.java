package codeChef;
import java.util.Scanner;
public class Javlin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int i=1;
		while(i<=test) {
			int n=sc.nextInt();
			int a=sc.nextInt();
			double x=Math.sqrt(n);
			int m= (int)x;
			int ans=(a*m);
			System.out.println(ans);
			i++;
		}
		sc.close();
	}
	}
