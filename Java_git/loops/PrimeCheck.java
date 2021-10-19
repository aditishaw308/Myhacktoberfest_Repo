package loops;
import java.util.Scanner;
public class PrimeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a Starting number:-");
		a = sc.nextInt();
		System.out.println("Enter a Ending number:-");
		b = sc.nextInt();
		sc.close();
		// Prime number Checking Process
		for (int i = a; i <= b; i++) {
			if (i == 1) {
				System.out.println(i + " is Non-Prime");
				continue;
			}
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % 2 == 0) {
					System.out.println(i + " is Non-Prime");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i + " is Prime");
			}
		}
	}

}
