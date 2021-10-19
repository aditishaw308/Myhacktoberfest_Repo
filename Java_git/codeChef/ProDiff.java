package codeChef;
import java.util.Scanner;
public class ProDiff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int diff[][]=new int[test][4];
		for(int i=0;i<test;i++) {
			for(int j=0;j<4;j++) {
				diff[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<test;i++) {
			int c=1;
			for(int j=0;j<3;j++) {
			    int k=1;
				for(int p=j+1;p<4;p++) {
					if(diff[i][j]==diff[i][p]) {
						k++;
						if(c<k){
						    c=k;
						}
						
					}
				}
			}
				if(c==4){
				    System.out.println("0");
				}else if(c==3){
				    System.out.println("1");
				}else{
				    System.out.println("2");
				} 
		}
	
		
		sc.close();
	}

}
