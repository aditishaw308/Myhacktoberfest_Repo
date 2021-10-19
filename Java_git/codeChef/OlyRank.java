package codeChef;
import java.util.Scanner;
public class OlyRank {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int test=sc.nextInt();
		int[][] oly = new int[test][6];
		for(int i=0;i<test;i++){
		  for(int j=0;j<6;j++){
		      oly[i][j]= sc.nextInt();
		  }
		}
		int rank[][]= new int[test][1];
		for(int i=0;i<test;i++) {
			int sum1=0;
			int sum2=0;
			for(int j=0;j<6;j++) {
				if(j<3) {
					sum1+=oly[i][j];
				}
				if(j>=3){
					sum2+=oly[i][j];
				}
			}
			int max=Math.max(sum1, sum2);
			if(sum2==sum1) {
				rank[i][0]=-1;
			}else if(max==sum1) {
				rank[i][0]=1;
			}else {
				rank[i][0]=2;
			}
		}
		for(int i=0;i<test;i++) {
			for(int j=0;j<1;j++) {
				System.out.print(rank[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
