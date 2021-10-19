package codeChef;
import java.util.Scanner;
public class ChfInvnt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int j=0;
		int i=0;
		int n=sc.nextInt();
		int p=sc.nextInt();
		int k=sc.nextInt();
		int day = 0;
		while(i<test) {
			int res=0;
			for(int c=0;c<n;c++) {
				if(c%k==j) {
					day++;
					if(c==p) {
						res=day;
						break;
					}
				}
			}
			j++;
			   if(res>0) {
				   System.out.println(res);
				   i++;
				   day=0;
				   j=0;
				   n=sc.nextInt();
				   p=sc.nextInt();
				   k=sc.nextInt();
			   }
		}
		sc.close();
	}

}
