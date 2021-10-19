package loops;
import java.util.Scanner;
public class LogarithimOf_2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=sc.nextInt();
		float sum=0;
		sc.close();
		for(float i=1;i<=n;i++) {
			if(i%2==0) {
				sum-=1/i;
			}else {
				sum+=1/i;
			}
		}
		System.out.println("Sum of LogarithimOf_2 is "+ sum);
	}
}