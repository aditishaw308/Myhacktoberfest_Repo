package codeChef;
import java.util.Scanner;
public class Chfinvnt2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int i=1;
		while(i<=test) {
			int n=sc.nextInt();
			int p=sc.nextInt();
			int k=sc.nextInt();
			int gas=0;
			int g=0;
			for(int j=1;j<=n;j++) {
				if(!(j%2==0)) {
					gas=g;
					g++;
				}else if(j%2==0) {
					gas+=k;
				}
				if(gas==p) {
					System.out.println(j);
					break;
				}
			}
			i++;
		}
		sc.close();

	}

}
