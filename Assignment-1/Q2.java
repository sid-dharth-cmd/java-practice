import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x = sc.nextInt();
		System.out.print("Enter second number: ");
		int y = sc.nextInt();
		int sumx = 0, sumy = 0;
		for (int i = 1; i <= x/2; i++) {
			if (x%i == 0)
				sumx += i; 
		}
		for (int i = 1; i <= y/2; i++) {
			if (y%i == 0)
				sumy += i;
		}
		if (sumx == y && sumy == x)
			System.out.println(x+" and "+y+" are amicable numbers.");
		else
			System.out.println(x+" and "+y+" are not amicable numbers.");
		sc.close();
	}

}
